package lock;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.ssicosm.slime_great_war.R;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity2 extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        Log.i("ActivityCallbacks", "mainActivityCreate");
//        InjectActivity.getInstance().setActivity(this).init().initViewLeftTop();
//        HackUtil.sendDelayFloatMessage();
//        HackLog.tip0();
    }
    static String getStatusString(int statusCode) {
       return "SUCCESS";
    }

}
