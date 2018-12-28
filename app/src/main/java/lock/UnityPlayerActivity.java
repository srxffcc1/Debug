package lock;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.TextView;

import com.ssicosm.slime_great_war.R;

import lock.date.DateUtil;
import lock.date.InjectActivity;
import lock.date.InjectActivityHideNowNoClickNotAutoDismiss;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity extends Activity {
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
        InjectActivityHideNowNoClickNotAutoDismiss.getInstance().setActivity(this).init().initViewLeftBootomNoBack();
        DateUtil.sendShotDelayFloatMessage();
    }
    public void test3(){
        InjectActivity.getInstance().setActivity(this).init().initViewLeftBottomNoFloat();
        DateUtil.sendDelayFloatMessage();
    }
    public void test2(){
        InjectActivity.getInstance().setActivity(this).init().initViewLeftBottom();
        DateUtil.sendDelayFloatMessage();
    }

    public void test4(){
        InjectActivity.getInstance().setActivity(this).init().initViewRightTop();
        DateUtil.sendDelayFloatMessage();
    }

}
