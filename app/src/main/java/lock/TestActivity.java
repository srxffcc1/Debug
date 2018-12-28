package lock;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;

import com.ssicosm.slime_great_war.R;

import home.HomeActivityL;
import home.HomeActivityP;
import home.util.InGViewAll;
import home.util.ViewHome;
import home.util.ViewPop;

/**
 * Created by King6rf on 2017/10/23.
 */

public class TestActivity extends Activity {
    private FrameLayout conn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InGViewAll.loadInterstitialAD(this);
        InGViewAll.loadBannerAD(this);
//        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
//
//            @TargetApi(Build.VERSION_CODES.KITKAT)
//            public void onClick(View v) {
//                PrintManager printManager = (PrintManager) TestActivity.this.getSystemService(Context.PRINT_SERVICE);
//                Log.v("SRX","准备打印");
//                String jobName =  "SRXDocument";
//
//                File file = new File(Environment.getExternalStorageDirectory() + "/test.pdf");
//
//                if (file.exists()) {
//                    PrintAttributes.Builder builder = new PrintAttributes.Builder();
//                    builder.setColorMode(PrintAttributes.COLOR_MODE_COLOR);
//                    printManager.print(jobName, new FilePrintDocumentAdapter(TestActivity.this, file), builder.build());
//                } else {
//                    Toast.makeText(TestActivity.this, "文件不存在请稍后再试!", Toast.LENGTH_LONG).show();
//                }
//
//            }
//        });
    }

    public void test(View view) {
//        int random=new Random().nextInt(3);
//        ViewPop.loadNativeExpressAD(TestActivity.this,0x7f07004a,ViewHome.APPID,"5000444829718564",-1,-2);
//        HomeActivityP.start(this);
//        HomeActivityL.start(this);
        InGViewAll.loadNativeExpressAD(this);



    }

    private void initView() {
    }
}
