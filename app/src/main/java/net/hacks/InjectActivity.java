package net.hacks;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/9.
 */
@SuppressWarnings("ResourceType")
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
    public void initViewLeftTop(){
        if(inittimes==0){
            Log.v("InjectActivity","进入");
            onCreateStartToReplaceSetContentViewLeftTop(true);
            inittimes++;
        }

    }
    public void initViewLeftBootom(){
        if(inittimes==0){
            Log.v("InjectActivity","进入");
            onCreateStartToReplaceSetContentViewLeftBottom(true);
            inittimes++;
        }

    }
    public void initViewNoBack(){
        if(inittimes==0){
            Log.v("InjectActivity","进入");
            onCreateStartToReplaceSetContentViewLeftTop(false);
            inittimes++;
        }

    }
    private void onCreateStartToReplaceSetContentViewLeftBottom(boolean needback) {
        FrameLayout parent=new FrameLayout(activity);
        DragLayout dragLayout=new DragLayout(activity);
        dragLayout.setBackgroundColor(Color.parseColor("#00000000"));
        dragLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        LinearLayout backlinear=new LinearLayout(activity);
        backlinear.setId(0x7f07000a);
        backlinear.setOrientation(LinearLayout.VERTICAL);
        boolean islandscape=false;
        if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.i("info", "landscape");
            islandscape=true;
        } else if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i("info", "portrait");
        }

        backlinear.setBackground(ImageUtilz.loadImageFromAsserts(activity, islandscape?"d3mbackh.png":"d3mbackv.png"));
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
        RelativeLayout.LayoutParams relayoutParams=new RelativeLayout.LayoutParams(430,175);
        relayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        relayoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        floatingView.setLayoutParams(relayoutParams);
        floatingView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        floatingView.setVisibility(View.INVISIBLE);
        backlinear.addView(textView1);
        backlinear.addView(d3mlogo);
        backlinear.addView(textView2);
        if(needback){
            backlinear.setVisibility(View.VISIBLE);
        }else{

            backlinear.setVisibility(View.GONE);
        }
        dragLayout.addView(floatingView);
        parent.addView(backlinear);
        parent.addView(dragLayout);
        ViewGroup viewGroup= (ViewGroup) activity.findViewById(android.R.id.content);
        viewGroup.addView(parent);
        onCreateEnd();
    }
    private void onCreateStartToReplaceSetContentViewLeftTop(boolean needback) {
        FrameLayout parent=new FrameLayout(activity);
        DragLayout dragLayout=new DragLayout(activity);
        dragLayout.setBackgroundColor(Color.parseColor("#00000000"));
        dragLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        LinearLayout backlinear=new LinearLayout(activity);
        backlinear.setId(0x7f07000a);
        backlinear.setOrientation(LinearLayout.VERTICAL);
        boolean islandscape=false;
        if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.i("info", "landscape");
            islandscape=true;
        } else if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i("info", "portrait");
        }

        backlinear.setBackground(ImageUtilz.loadImageFromAsserts(activity, islandscape?"d3mbackh.png":"d3mbackv.png"));
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
        if(needback){
            backlinear.setVisibility(View.VISIBLE);
        }else{

            backlinear.setVisibility(View.GONE);
        }
        dragLayout.addView(floatingView);
        parent.addView(backlinear);
        parent.addView(dragLayout);
        ViewGroup viewGroup= (ViewGroup) activity.findViewById(android.R.id.content);
        viewGroup.addView(parent);
        onCreateEnd();
    }

    private void onCreateEnd() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                View tmpview=activity.findViewById(0x7f07000a);
                if(tmpview!=null){
                    tmpview.setVisibility(View.GONE);
                }

            }
        },Integer.parseInt("5000"));
        HackUtil.setFloat(activity);
    }
    public void start3dmWeb(View view){
        HackUtil.start3dmWeb3(activity);
    }
}
