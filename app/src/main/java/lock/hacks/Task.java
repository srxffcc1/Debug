package lock.hacks;

import android.app.Activity;

/**
 * Created by King6rf on 2018/1/4.
 */

public class Task {
    public static void initViewLeftBootom(Activity context){
        InjectActivity.getInstance().setActivity(context).init().initViewLeftBootom();
        HackUtil.sendDelayFloatMessage();

    }
    public static void initViewLeftTop(Activity context){
        InjectActivity.getInstance().setActivity(context).init().initViewLeftTop();
        HackUtil.sendDelayFloatMessage();

    }
}
