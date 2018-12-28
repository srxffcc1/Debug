package lock;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.Vector;

import lock.date.DateUtil;
import lock.date.InjectActivity;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity2 extends UnityPlayerActivity {

    private static Activity activity;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        InjectActivity.getInstance().setActivity(this).init().initViewLeftBottom();
        DateUtil.sendDelayFloatMessage();

    }





//    private void showAlerDialog() {
//        AlertDialog dialog = new AlertDialog.Builder(this)
//                .setTitle("AlerDialog")
//                .setMessage("这是一个AlertDialog")
//                .setPositiveButton("确定",null)
//                .setNegativeButton("取消",null)
//                .create();
//        dialog.show();
//        try {
//            Field mAlert = AlertDialog.class.getDeclaredField("mAlert");
//            mAlert.setAccessible(true);
//            Object mAlertController = mAlert.get(dialog);
//            Field mMessage = mAlertController.getClass().getDeclaredField("mTitleView");
//            mMessage.setAccessible(true);
//            TextView mMessageView = (TextView) mMessage.get(mAlertController);
//            mMessageView.setTextColor(Color.BLUE);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//    }

}
