package com.debugapplication;

import android.os.AsyncTask;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Administrator on 2017/7/9.
 */

public class FileCopyTask extends AsyncTask<String,Integer,Integer> {
    @Override
    protected Integer doInBackground(String... params) {
        String instring=params[0];
        String outstring=params[1];
        FileInputStream in = null;
        FileOutputStream out = null;
        if(new File(outstring).exists()){
            return 100;
        }
        if(!new File(outstring).getParentFile().exists()){
            new File(outstring).getParentFile().mkdirs();
        }
        try {
            in = new FileInputStream(instring);
            out = new FileOutputStream(outstring);
            //NIO 专属 传输通道
            FileChannel fcin = in.getChannel();
            FileChannel fout = out.getChannel();
            int totleSize = in.available();
            //NIO 专属 运输小车
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int eachSize=0;
            int copyedSize=0;
            while ((eachSize = fcin.read(buffer)) != -1) {
                //指针回零 然后开始读取数据 直到内容末尾
                buffer.flip();
                fout.write(buffer);
                //清空小车
                buffer.clear();
                //设置 进度条显示内容
                copyedSize += eachSize;
                publishProgress(copyedSize);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入和输出流
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return 100;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.v("FileCopyTask","任务开始");
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
        Log.v("FileCopyTask","任务完成");
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        Log.v("FileCopyTask","进度"+values[0]);
    }
}
