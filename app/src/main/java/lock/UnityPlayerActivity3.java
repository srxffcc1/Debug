package lock;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.ssicosm.slime_great_war.R;

import home.HomeActivityP;
import home.util.InGViewAll;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity3 extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);

//        textView.setInputType(InputType.TYPE_NULL);

        Log.i("ActivityCallbacks", "mainActivityCreate");
//        Task.initViewLeftTop(this);
//        Task.initViewLeftBootom(this);
//        test2();
//        test4();
    }
    public void test1(){
        InGViewAll.loadBannerAD(this);
    }
    public void test3(){

        InGViewAll.loadInterstitialAD(this);
    }
    public void test2(){

//        InGViewAll.loadNativeExpressAD(this);
        HomeActivityP.start(this);

    }

    public void test4(){

//        InGViewAll.loadBannerAD(this);
    }
    public void test5(){

//        InGViewAll.loadBannerAD(this);
    }
    public void test6(){
    }

}
