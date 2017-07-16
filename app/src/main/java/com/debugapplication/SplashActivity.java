package com.debugapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/16.
 */

public class SplashActivity extends Activity{
    private Activity activity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=this;
        FrameLayout parent=new FrameLayout(activity);
        LinearLayout backlinear=new LinearLayout(activity);
        backlinear.setId(0x7f07000a);
        backlinear.setOrientation(LinearLayout.VERTICAL);
        backlinear.setBackground(ImageUtilz.loadImageFromAsserts(activity,"d3mback.png"));
        backlinear.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        TextView textView1=new TextView(activity);
        textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        TextView textView2=new TextView(activity);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        ImageView d3mlogo=new ImageView(activity);
        d3mlogo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        d3mlogo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d3mlogo.setImageDrawable(ImageUtilz.loadImageFromAsserts(activity,"d3mlogo.png"));
        backlinear.addView(textView1);
        backlinear.addView(d3mlogo);
        backlinear.addView(textView2);
        parent.addView(backlinear);
        ViewGroup viewGroup= (ViewGroup) activity.findViewById(android.R.id.content);
        viewGroup.addView(parent);
        setContentView(parent);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    startActivity(new Intent(SplashActivity.this,Class.forName("air.net.gritfish.mallowdrops.AppEntry")));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                finish();
            }
        },Integer.parseInt("1000"));
    }
}
