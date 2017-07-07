package com.debugapplication;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.widget.Toast;

import com.ssicosm.slime_great_war.R;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */

public class DebugUtil {
    public static void start3dmWeb1(Context activity){
        if(isWeixinAvilible(activity)){
            ClipboardManager clipboard = (ClipboardManager)
                    activity.getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("simple text","3DM汉化组");
            clipboard.setPrimaryClip(clip);
            Intent intent = new Intent();
            ComponentName cmp=new ComponentName("com.tencent.mm","com.tencent.mm.ui.LauncherUI");
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setComponent(cmp);
            ((Activity)activity).startActivityForResult(intent,2001);//
             Toast.makeText(activity,"已经把公众号复制到剪切板\n可以方便关注",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(activity,"没有检测到微信",Toast.LENGTH_LONG).show();
        }
    }
    public static boolean isWeixinAvilible(Context context) {
        final PackageManager packageManager = context.getPackageManager();// 获取packagemanager
        List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);// 获取所有已安装程序的包信息
        if (pinfo != null) {
            for (int i = 0; i < pinfo.size(); i++) {
                String pn = pinfo.get(i).packageName;
                if (pn.equals("com.tencent.mm")) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void start3dmWeb2(Context activity){
        Intent intent = new Intent();
//Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri content_url = Uri.parse("http://www.3dmgame.com/");
        intent.setData(content_url);
        ((Activity)activity).startActivityForResult(intent,2001);//
    }
    public static void start3dmWeb3(Context activity){
//        start3dmWeb1(activity);
        Intent intent = new Intent(activity,WebActivity.class);
//Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ((Activity)activity).startActivityForResult(intent,2001);//
    }
    public static void setFloat(final Activity activity){
        DebugHandler.instance().addListener(12357, new DebugHandler.HandlerListener() {
            @Override
            public void hand(Message msg) {
                activity.findViewById(0x7f07000b).setVisibility(View.VISIBLE);
            }
        });

    }
    public static void sendFloatMessage(){
        DebugHandler.instance().sendEmptyMessage(12357);
    }
}
