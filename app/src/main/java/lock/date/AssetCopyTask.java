package lock.date;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Message;

import java.io.File;
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
        if(!new File(outstring).getParentFile().exists()){
            new File(outstring).getParentFile().mkdirs();
        }
        try {
             is=context.getAssets().open(
                    instring);
//            is=new FileInputStream(instring);
            fos= new FileOutputStream(outstring);
            long total=is.available();
            int copyedSize=0;
//            int needsize=total>512*1024*1024?4096:1024;
            byte[] buffer = new byte[8192];
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
//        Log.v("AssetCopyTask","任务开始");

    }

    @Override
    protected void onPostExecute(Long integer) {
        super.onPostExecute(integer);
//        Log.v("AssetCopyTask","任务完成");
        DateHandler.instance().sendEmptyMessage(12359);
    }

    @Override
    protected void onProgressUpdate(Long... values) {
        super.onProgressUpdate(values);
//        Log.v("AssetCopyTask","进度"+values[0]+",全部:"+values[1]);

        long jindu=values[0];
        long tot=values[1];
        int getjindu=(int) (jindu*1000/tot);
//        Log.v("SRX","阐出进度"+getjindu);
        Message message=new Message();
        message.what=12358;
        message.obj=getjindu;
        DateHandler.instance().sendMessage(message);
//        Message message2=new Message();
//        message2.what=12360;
//        message2.obj=getjindu;
//        DebugHandler.instance().sendMessage(message2);
    }
}
