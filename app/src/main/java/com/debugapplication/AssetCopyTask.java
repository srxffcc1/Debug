package com.debugapplication;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/9.
 */

public class AssetCopyTask extends AsyncTask<String,Long,Long> {
    Context context;
    public AssetCopyTask(Context context){
        this.context=context;
    }
    @Override
    protected Long doInBackground(String... params) {
        String instring=params[0];
        String outstring=params[1];
        InputStream is=null;
        FileOutputStream fos = null;
        try {
             is=context.getAssets().open(
                    instring, AssetManager.ACCESS_BUFFER);
//            is=new FileInputStream(instring);
             fos= new FileOutputStream(outstring);
            long total=is.available();
            int copyedSize=0;
            byte[] buffer = new byte[3072];
            long byteCount = 0;
            int len = 0;
            long sum = 0;
            while (sum < total) {//这里是下载文件是否能全部下载完的关键！
//                Log.v("FileCopyTask","进入");
                len = is.read(buffer);

//                Log.v("SRX","每次读取:"+len);
                fos.write(buffer, 0, len);
                sum += len;
//                Log.v("SRX","进度"+sum+",全部:"+total);
                publishProgress(sum,total);
//                Log.v("SRX","剩余:"+(total-sum));
            }
            return 100l;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 100l;
        } finally {
            try {
                fos.flush();// 刷新缓冲区
                is.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.v("AssetCopyTask","任务开始");

    }

    @Override
    protected void onPostExecute(Long integer) {
        super.onPostExecute(integer);
        Log.v("AssetCopyTask","任务完成");
    }

    @Override
    protected void onProgressUpdate(Long... values) {
        super.onProgressUpdate(values);
        Log.v("AssetCopyTask","进度"+values[0]+",全部:"+values[1]);
    }
}
