package net.hacks;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class ListenerApplication extends Application {
    public int loadtime=0;
    private String loadclass;

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("打开app");
        loadtime=0;
        try {
            ApplicationInfo appInfo = this.getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            loadclass = appInfo.metaData.getString("loadclass");
            if(loadclass.startsWith(".")){
                loadclass=getPackageName()+loadclass;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        CrashHelp.instance(this,null,"6bd6fe43d2");
        this.registerActivityLifecycleCallbacks(new BusinessActivityCallbacks());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        loadtime=0;
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        loadtime=0;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        loadtime=0;
    }

    class BusinessActivityCallbacks implements ActivityLifecycleCallbacks{

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            Log.i("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityCreated");

        }

        @Override
        public void onActivityStarted(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityStarted");
            if(loadtime==0&&activity.getClass().getName().equals(loadclass)){
                loadtime=1;
                InjectActivity.getInstance().setActivity(activity).init().initViewLeftTop();
                HackUtil.sendDelayFloatMessage();
            }

        }

        @Override
        public void onActivityResumed(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityResumed");
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityPaused");

        }

        @Override
        public void onActivityStopped(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityStopped");

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivitySaveInstanceState");

        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            Log.i("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityDestroyed");
        }
    }
}
