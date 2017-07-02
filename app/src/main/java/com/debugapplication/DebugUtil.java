package com.debugapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by Administrator on 2017/7/1.
 */

public class DebugUtil {
    public static void start3dmWeb(Context activity){
        Intent intent = new Intent();
//Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri content_url = Uri.parse("http://www.3dmgame.com/");
        intent.setData(content_url);
        activity.startActivity(intent);
    }
}
