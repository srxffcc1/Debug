package com.debugapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ssicosm.slime_great_war.R;

/**
 * Created by Administrator on 2017/6/17.
 */

public class TesTActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_test);
    }

    public void test(View view) {
        Intent intent = new Intent();
//Intent intent = new Intent(Intent.ACTION_VIEW,uri);

        intent.setAction("android.intent.action.VIEW");

        Uri content_url = Uri.parse("http://www.3dmgame.com/");

        intent.setData(content_url);

        startActivity(intent);
    }
}
