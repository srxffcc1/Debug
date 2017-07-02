package com.debugapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.ssicosm.slime_great_war.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debug_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    startActivity(new Intent(MainActivity.this,Class.forName("com.unity3d.player.UnityPlayerActivity")));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                MainActivity.this.finish();
            }
        },300);
    }
//    @Deprecated
//    public static int isGooglePlayServicesAvailable(Context context) {
//        return 9;
//    }
}
