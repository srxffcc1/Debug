package com.debugapplication;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class ListenerApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        this.registerActivityLifecycleCallbacks(new BusinessActivityCallbacks());
    }

    class BusinessActivityCallbacks implements ActivityLifecycleCallbacks{

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            Log.v("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityCreated");

        }

        @Override
        public void onActivityStarted(Activity activity) {
            Log.v("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityStarted");

        }

        @Override
        public void onActivityResumed(Activity activity) {
            Log.v("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityResumed");
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Log.v("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityPaused");

        }

        @Override
        public void onActivityStopped(Activity activity) {
            Log.v("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityStopped");

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Log.v("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivitySaveInstanceState");

        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            Log.v("ActivityCallbacks", activity.getClass().getSimpleName()+":"+"onActivityDestroyed");
        }
    }
}
