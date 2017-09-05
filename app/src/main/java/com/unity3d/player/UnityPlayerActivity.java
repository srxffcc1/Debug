package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.ssicosm.slime_great_war.R;

/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        System.out.println("来自activity");
//        InjectActivity.getInstance().setActivity(this).init().initViewLeftTop();
//        DebugUtil.sendDelayFloatMessage();


    }
    public  int  isGooglePlayServicesAvailable(Context i){
        return 3;
    }

}
