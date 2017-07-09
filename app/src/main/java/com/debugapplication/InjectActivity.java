package com.debugapplication;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/9.
 */

public class InjectActivity {
    private static final InjectActivity instance=new InjectActivity();
    private Activity activity;
    private int inittimes=0;


    private InjectActivity() {

    }
    public static InjectActivity getInstance(){
        return instance;
    }
    public InjectActivity setActivity(Activity activity){
        this.activity=activity;
        return instance;
    }
    public InjectActivity init(){
        inittimes=0;
        return instance;
    }
    public void initView(){
        if(inittimes==0){
            Log.v("InjectActivity","进入");
            onCreateStartToReplaceSetContentView();
            inittimes++;
        }

    }
    private void onCreateStartToReplaceSetContentView() {
        FrameLayout parent=new FrameLayout(activity);
        DragLayout dragLayout=new DragLayout(activity);
        dragLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
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
        FloatingView floatingView=new FloatingView(activity);
        floatingView.setId(0x7f07000b);
        floatingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start3dmWeb(v);
            }
        });
        floatingView.setImageDrawable(ImageUtilz.loadImageFromAsserts(activity,"splash23dm.png"));
        floatingView.setLayoutParams(new LinearLayout.LayoutParams(430,175));
        floatingView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        floatingView.setVisibility(View.INVISIBLE);
        backlinear.addView(textView1);
        backlinear.addView(d3mlogo);
        backlinear.addView(textView2);
        dragLayout.addView(backlinear);
        dragLayout.addView(floatingView);
        parent.addView(dragLayout);
        ViewGroup viewGroup= (ViewGroup) activity.findViewById(android.R.id.content);
        viewGroup.addView(parent);
        onCreateEnd();
    }

    private void onCreateEnd() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                activity.findViewById(0x7f07000a).setVisibility(View.GONE);
            }
        },5000);
        DebugUtil.setFloat(activity);
    }
    public void start3dmWeb(View view){
        DebugUtil.start3dmWeb3(activity);
    }
}
