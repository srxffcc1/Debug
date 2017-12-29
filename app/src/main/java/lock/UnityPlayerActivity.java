package lock;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.ssicosm.slime_great_war.R;

import lock.hacks.HackLog;
import lock.hacks.HackUtil;
import lock.hacks.InjectActivity;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        Log.i("ActivityCallbacks", "mainActivityCreate");
        InjectActivity.getInstance().setActivity(this).init().initViewLeftTop();
        HackUtil.sendDelayFloatMessage();
        HackLog.tip0();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(UnityPlayerActivity.this,UnityPlayerActivity2.class));
//            }
//        },2000);
    }
    static String getStatusString(int statusCode) {
       return "SUCCESS";
    }

}
