package lock;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Field;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity2 extends Activity {

    private static Activity activity;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    HttpUrlConnectUtil.doGet("http://wthrcdn.etouch.cn/weather_mini?city=%E6%B3%B0%E5%B7%9E","");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
        showAlerDialog();

    }
    private void showAlerDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("AlerDialog")
                .setMessage("这是一个AlertDialog")
                .setPositiveButton("确定",null)
                .setNegativeButton("取消",null)
                .create();
        dialog.show();
        try {
            Field mAlert = AlertDialog.class.getDeclaredField("mAlert");
            mAlert.setAccessible(true);
            Object mAlertController = mAlert.get(dialog);
            Field mMessage = mAlertController.getClass().getDeclaredField("mTitleView");
            mMessage.setAccessible(true);
            TextView mMessageView = (TextView) mMessage.get(mAlertController);
            mMessageView.setTextColor(Color.BLUE);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
