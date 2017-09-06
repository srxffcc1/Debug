package net.hacks;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2017/7/16.
 */

public class SplashActivity extends Activity{
    private Activity activity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectActivity.getInstance().setActivity(this).initViewLeftTop();
        HackUtil.sendDelayFloatMessage();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    startActivity(new Intent(SplashActivity.this,Class.forName("net.UnityPlayerActivity")));
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                finish();
//            }
//        },Integer.parseInt("1000"));
    }
}
