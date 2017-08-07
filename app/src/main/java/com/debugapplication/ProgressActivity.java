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

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.text.DecimalFormat;

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
        backlinear.setBackground(ImageUtilz.loadImageFromAsserts(activity, "d3mbackh.jpg"));
        backlinear.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        TextView textView1=new TextView(activity);
        textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        TextView textView2=new TextView(activity);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1));
        ProgressBar bar=new ProgressBar(this,null,android.R.attr.progressBarStyleHorizontal);
        bar.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        bar.setIndeterminate(true);
        bar.setId(0x7f07000d);
//        bar.setMax(1000);
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
        if(new File(resultdir+needassetsstart+".obb").exists()){
            try {
                startActivity(new Intent(ProgressActivity.this,Class.forName("com.unity3d.player.UnityPlayerActivity")));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            finish();
        }else{
            initTask();
        }


    }
//
    @Override
    protected void onDestroy() {
        super.onDestroy();
        DebugHandler.instance().removeListener(12358,12359);
    }
    String needassetsstart="main.11.com.NightSchool.Oxenfree";
    String tmpassetsdir=Environment.getExternalStorageDirectory()+"/Android/tmp/com.NightSchool.Oxenfree"+"/";
    String resultdir=Environment.getExternalStorageDirectory()+"/Android/obb/com.NightSchool.Oxenfree"+"/";
    public void initTask(){
        new AssetCopyTaskS(this).execute(needassetsstart,tmpassetsdir );
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
                bar.setMax(1000);
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
                DecimalFormat decimalFormat=new DecimalFormat(".0");//
                double jindutest= (getjindu/10.0);
                textview.setText("载入中"+decimalFormat.format(jindutest)+"%");
//                int jindu=(int) (array[0]*1000/array[1]);
            }
        });
        DebugHandler.instance().addListener(12361, new DebugHandler.HandlerListener() {
            @Override
            public void hand(Message msg) {
                int getjindu= (int) msg.obj;
                TextView textview= (TextView) findViewById(0x7f07000c);
                ProgressBar bar= (ProgressBar) findViewById(0x7f07000d);
                bar.setIndeterminate(false);
//                textview.setText("载入中"+jindutest);
//                int jindu=(int) (array[0]*1000/array[1]);

//                Log.v("SRX","设置进度"+getjindu);
                bar.setProgress(getjindu);
            }
        });
        DebugHandler.instance().addListener(12362, new DebugHandler.HandlerListener() {
            @Override
            public void hand(Message msg) {
                TextView textview= (TextView) findViewById(0x7f07000c);
                ProgressBar bar= (ProgressBar) findViewById(0x7f07000d);
//                bar.setIndeterminate(true);
                bar.setIndeterminate(false);
                bar.setMax(zipnumber);
                bar.setProgress(zipnumber);
                textview.setText("解压完成");
                try {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            FileUtil.delete(new File(tmpassetsdir));
                        }
                    }).start();
                    startActivity(new Intent(ProgressActivity.this,Class.forName("com.unity3d.player.UnityPlayerActivity")));
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
                    startExtrat();
//                    startActivity(new Intent(ProgressActivity.this,Class.forName("com.unity3d.player.UnityPlayerActivity")));
//                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
    int zipnumber=0;
    ZipFile zipFile=null;
    public void startExtrat() throws ZipException {

        zipFile=new ZipFile(tmpassetsdir+needassetsstart+".zip");
        zipnumber=this.zipFile.getFileHeaders().size();
        ProgressBar bar= (ProgressBar) findViewById(0x7f07000d);
        bar.setMax(0);
        TextView textview= (TextView) findViewById(0x7f07000c);
        textview.setText("解压中");
        bar.setIndeterminate(true);
        new UnZipTask(this, resultdir, zipnumber).execute(new ZipFile[]{this.zipFile});
    }

}
