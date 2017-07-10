package com.unity3d.player;

import android.app.Activity;
import android.os.Bundle;

import com.debugapplication.DebugUtil;
import com.debugapplication.InjectActivity;

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
        this.mUnityPlayer.requestFocus();
        InjectActivity.getInstance().setActivity(this).init().initView();
        DebugUtil.sendDelayFloatMessage();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
