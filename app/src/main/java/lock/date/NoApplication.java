package lock.date;

import android.app.Application;
import android.content.Context;

/**
 * Created by King6rf on 2018/1/26.
 */

public class NoApplication extends Application {
    static Context applicationcontext;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        applicationcontext=base;
        StringConvert.init(base);
    }
}
