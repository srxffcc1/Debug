package lock;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.ssicosm.slime_great_war.R;

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
        InjectActivity.getInstance().setActivity(this).init().initViewLeftBootom();
        HackUtil.sendDelayFloatMessage();
//        Task.initViewLeftTop(this);
//        Task.initViewLeftBootom(this);
    }

}
