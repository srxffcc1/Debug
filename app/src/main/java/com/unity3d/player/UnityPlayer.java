package com.unity3d.player;

import android.content.Context;
import android.view.View;

import com.debugapplication.DebugUtil;

import java.io.File;

/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayer extends View {

    public UnityPlayer(Context context) {
        super(context);
        DebugUtil.sendFloatMessage();//
        File file = new File("file:///android_asset/main.11.com.NightSchool.Oxenfree.obb");

    }
}