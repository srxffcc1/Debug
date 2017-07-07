package com.unity3d.player;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.debugapplication.DebugUtil;
import com.debugapplication.DragLayout;
import com.debugapplication.FloatingView;
import com.debugapplication.ImageUtilz;

/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity extends Activity {
    UnityPlayer mUnityPlayer;
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFormat(2);
        this.mUnityPlayer = new UnityPlayer(this);
        onCreateStartToReplaceSetContentView(mUnityPlayer);
        this.mUnityPlayer.requestFocus();
        onCreateEnd();
    }

    private void onCreateStartToReplaceSetContentView(View viewneed) {
        FrameLayout parent=new FrameLayout(this);
        FrameLayout playercontent=new FrameLayout(this);
        DragLayout dragLayout=new DragLayout(this);
        dragLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        LinearLayout backlinear=new LinearLayout(this);
        backlinear.setId(0x7f07000a);
        backlinear.setOrientation(LinearLayout.VERTICAL);
        backlinear.setBackground(ImageUtilz.loadImageFromAsserts(this,"d3mback.png"));
        backlinear.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        TextView textView1=new TextView(this);
        textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        TextView textView2=new TextView(this);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        ImageView d3mlogo=new ImageView(this);
        d3mlogo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        d3mlogo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d3mlogo.setImageDrawable(ImageUtilz.loadImageFromAsserts(this,"d3mlogo.png"));
        FloatingView floatingView=new FloatingView(this);
        floatingView.setId(0x7f07000b);
        floatingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start3dmWeb(v);
            }
        });
        floatingView.setImageDrawable(ImageUtilz.loadImageFromAsserts(this,"splash23dm.png"));
        floatingView.setLayoutParams(new LinearLayout.LayoutParams(430,175));
        floatingView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        backlinear.addView(textView1);
        backlinear.addView(d3mlogo);
        backlinear.addView(textView2);
        dragLayout.addView(backlinear);
        dragLayout.addView(floatingView);
        playercontent.addView(viewneed);
        parent.addView(playercontent);
        parent.addView(dragLayout);
        setContentView(parent);
    }

    private void onCreateEnd() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                findViewById(0x7f07000a).setVisibility(View.GONE);
            }
        },5000);
        DebugUtil.setFloat(this);
    }

    public void start3dmWeb(View view){
        DebugUtil.start3dmWeb3(this);
    }
}
