package lock;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ssicosm.slime_great_war.R;

/**
 * Created by King6rf on 2017/10/23.
 */

public class TestActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
