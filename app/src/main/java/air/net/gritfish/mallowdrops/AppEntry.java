package air.net.gritfish.mallowdrops;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/9.
 */

public class AppEntry extends Activity{
    private static AppEntry sThis = null;
    private boolean sRuntimeClassesLoaded;
    private boolean runtimeInstalled;
    private boolean runtimeOnExternalStorage;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sThis = this;
        Log.i("StartupTime1", ":" + new Date().getTime());
        runTask1();
    }
    public void runTask1(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean hasCaptiveRuntime = loadCaptiveRuntimeClasses();

                if (!hasCaptiveRuntime) {
                    if (sRuntimeClassesLoaded || isRuntimeInstalled()) {
                        loadSharedRuntimeDex();
                    } else if (isRuntimeOnExternalStorage()) {
                        showRuntimeOnExternalStorageDialog();
                        return;
                    } else {
                        showRuntimeNotInstalledDialog();
                        return;
                    }
                }
                if (sRuntimeClassesLoaded) {
                    createActivityWrapper(hasCaptiveRuntime);
                    InvokeWrapperOnCreate();
                } else if (hasCaptiveRuntime) {
                    KillSelf();
                } else {
                    launchAIRService();
                }
            }
        }).start();
    }
    private void launchAIRService() {

    }

    private void KillSelf() {

    }

    private void InvokeWrapperOnCreate() {

    }

    private void createActivityWrapper(boolean hasCaptiveRuntime) {
    }

    private void showRuntimeNotInstalledDialog() {
    }

    private void showRuntimeOnExternalStorageDialog() {

    }

    private void loadSharedRuntimeDex() {
    }

    private boolean loadCaptiveRuntimeClasses() {
        return false;
    }

    public boolean isRuntimeInstalled() {
        return runtimeInstalled;
    }

    public boolean isRuntimeOnExternalStorage() {
        return runtimeOnExternalStorage;
    }
}
