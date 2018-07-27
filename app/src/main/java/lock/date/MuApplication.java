package lock.date;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class MuApplication extends Application {

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        boolean classexist = false;
        try {

            Class aClass = Class.forName("android.support.multidex.MultiDex");
            classexist = true;
        } catch (ClassNotFoundException e) {

// TODO Auto-generated catch block
            classexist = false;
            e.printStackTrace();
            Log.e("NET-", "无此类");

        }
        if (classexist) {
            try {
                MultiDex.install(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Log.e("NET-", "android.support.multidex.MultiDex not ");
        }

    }
}
