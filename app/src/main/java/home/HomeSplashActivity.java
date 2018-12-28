package home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.widget.FrameLayout;

import home.util.InGViewAll;
import lock.TestActivity;

public class HomeSplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout=new FrameLayout(this);
        setContentView(frameLayout);
        InGViewAll.loadSplashAD(this);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_HOME) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void finish() {
        startActivity(new Intent(getBaseContext(),TestActivity.class));
        super.finish();
    }
}
