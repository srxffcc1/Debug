package lock.hacks;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class ListenerApplication extends Application {
    public int loadtime = 0;
    private String loadclass;
    private String need = "";

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("打开app");
//        loadtime = 0;
//        try {
//            ApplicationInfo appInfo = this.getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
//            loadclass = appInfo.metaData.getString("loadclass");
//            need = appInfo.metaData.getString("need");
//            if (loadclass.startsWith(".")) {
//                loadclass = getPackageName() + loadclass;
//
//            }
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }
//        CrashHelp.instance(this, null, "6bd6fe43d2");
        this.registerActivityLifecycleCallbacks(new BusinessActivityCallbacks());
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//        boolean classexist = false;
//        try {
//
//            Class aClass = Class.forName("android.support.multidex.MultiDex");
//            classexist = true;
//
//
//        } catch (ClassNotFoundException e) {
//
//// TODO Auto-generated catch block
//            classexist = false;
//            e.printStackTrace();
//
//            Log.e("NET-", "无此类");
//
//        }
//        if (classexist) {
//            try {
//                MultiDex.install(this);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            Log.e("NET-", "android.support.multidex.MultiDex not ");
//        }

    }

//    @Override
//    public void onTerminate() {
//        super.onTerminate();
//        Log.i("ActivityCallbacks", "结束清理");
//        loadtime = 0;
//    }

    class BusinessActivityCallbacks implements ActivityLifecycleCallbacks {

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName() + ":" + "onActivityCreated");


        }

        @Override
        public void onActivityStarted(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName() + ":" + "onActivityStarted");
//            if (loadtime == 0 && activity.getClass().getName().equals(loadclass)) {
//                loadtime = 1;
//                if (need.equals("srx")) {
//                    InjectActivity.getInstance().setActivity(activity).init().initViewLeftTop();
//                    HackUtil.sendDelayFloatMessage();
//                }
//
//            }


        }

        @Override
        public void onActivityResumed(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName() + ":" + "onActivityResumed");
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName() + ":" + "onActivityPaused");

        }

        @Override
        public void onActivityStopped(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName() + ":" + "onActivityStopped");

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName() + ":" + "onActivitySaveInstanceState");

        }

        @Override
        public void onActivityDestroyed(Activity activity) {
//            if (activity.isTaskRoot()) {
//                Log.i("ActivityCallbacks", "还原");
//                loadtime = 0;
//            }
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName() + ":" + "onActivityDestroyed");
        }
    }
}
