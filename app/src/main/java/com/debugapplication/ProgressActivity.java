package com.debugapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
@SuppressWarnings("ResourceType")
public class ProgressActivity extends Activity {
    private Activity activity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=this;
        initPrograss();
    }
    public void initPrograss(){
        FrameLayout parent=new FrameLayout(activity);
        LinearLayout backlinear=new LinearLayout(activity);
        LinearLayout progressparent=new LinearLayout(activity);
        progressparent.setOrientation(LinearLayout.VERTICAL);
        progressparent.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        progressparent.setGravity(Gravity.CENTER);
        backlinear.setId(0x7f07000a);
        backlinear.setOrientation(LinearLayout.VERTICAL);
        backlinear.setBackground(ImageUtilz.loadImageFromAsserts(activity,"d3mback.png"));
        backlinear.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        TextView textView1=new TextView(activity);
        textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        TextView textView2=new TextView(activity);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        ProgressBar bar=new ProgressBar(this,null,android.R.attr.progressBarStyleHorizontal);
        bar.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        bar.setIndeterminate(true);
        bar.setId(0x7f07000d);
        bar.setMax(1000);
        bar.setPadding(20,20,20,20);
        ImageView d3mlogo=new ImageView(activity);
        d3mlogo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        d3mlogo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d3mlogo.setImageDrawable(ImageUtilz.loadImageFromAsserts(activity,"d3mlogo.png"));
        TextView zairu=new TextView(this);
        zairu.setId(0x7f07000c);
        zairu.setText("载入中");
        zairu.setGravity(Gravity.CENTER);
        zairu.setTextSize(20);
        zairu.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        backlinear.addView(textView1);

//        backlinear.addView(d3mlogo);
        progressparent.addView(bar);
        progressparent.addView(zairu);
        backlinear.addView(textView2);
        parent.addView(backlinear);
        parent.addView(progressparent);
        ViewGroup viewGroup= (ViewGroup) activity.findViewById(android.R.id.content);
        viewGroup.addView(parent);
        resigiter();
        initTask();

    }
//
    @Override
    protected void onDestroy() {
        super.onDestroy();
        DebugHandler.instance().removeListener(12358,12359);
    }

    public void initTask(){
        new AssetCopyTask(this).execute("main.11.com.NightSchool.Oxenfree.obb", Environment.getExternalStorageDirectory()+"/Android/obb/com.NightSchool.Oxenfree"+"/main.11.com.NightSchool.Oxenfree.obb");
    }
    public void resigiter(){
        DebugHandler.instance().addListener(12358, new DebugHandler.HandlerListener() {
            @Override
            public void hand(Message msg) {
//                long[] array= (long[]) msg.obj;
                int getjindu= (int) msg.obj;
                TextView textview= (TextView) findViewById(0x7f07000c);
                ProgressBar bar= (ProgressBar) findViewById(0x7f07000d);
                bar.setIndeterminate(false);
                float jindutest= (float) (getjindu/1000);
//                textview.setText("载入中"+jindutest);
//                int jindu=(int) (array[0]*1000/array[1]);

//                Log.v("SRX","设置进度"+getjindu);
                bar.setProgress(getjindu);
            }
        });
        DebugHandler.instance().addListener(12360, new DebugHandler.HandlerListener() {
            @Override
            public void hand(Message msg) {
//                long[] array= (long[]) msg.obj;
                int getjindu= (int) msg.obj;
                TextView textview= (TextView) findViewById(0x7f07000c);
                float jindutest= (float) (getjindu/1000);
                textview.setText("载入中"+jindutest);
//                int jindu=(int) (array[0]*1000/array[1]);
            }
        });
        DebugHandler.instance().addListener(12359, new DebugHandler.HandlerListener() {
            @Override
            public void hand(Message msg) {
                TextView textview= (TextView) findViewById(0x7f07000c);
                ProgressBar bar= (ProgressBar) findViewById(0x7f07000d);
                bar.setIndeterminate(false);
                textview.setText("载入完成");
                bar.setProgress(1000);
                try {
                    startActivity(new Intent(ProgressActivity.this,Class.forName("com.unity3d.player.UnityPlayerActivity")));
                    finish();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
