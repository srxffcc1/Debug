package com.unity3d.player;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;

import com.debugapplication.DebugUtil;
import com.ssicosm.slime_great_war.R;

/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity extends Activity {
    UnityPlayer mUnityPlayer;
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFormat(2);
        this.mUnityPlayer = new UnityPlayer(this);
        setContentView(R.layout.main_test);
        FrameLayout view= (FrameLayout) this.findViewById(R.id.framemain);
        view.addView(this.mUnityPlayer);
        this.mUnityPlayer.requestFocus();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                findViewById(R.id.dragss).setVisibility(View.GONE);
            }
        },5000);
    }
    public void start3dmWeb(View view){
        DebugUtil.start3dmWeb1(this);
    }
}
