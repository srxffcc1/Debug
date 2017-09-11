package lock;

import android.app.Activity;
import android.os.Bundle;

import lock.hacks.HackLog;
import lock.hacks.HackUtil;
import lock.hacks.InjectActivity;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InjectActivity.getInstance().setActivity(this).init().initViewLeftTop();
        HackUtil.sendDelayFloatMessage();
        HackLog.tip0();
    }
    static String getStatusString(int statusCode) {
       return "SUCCESS";
    }

}
