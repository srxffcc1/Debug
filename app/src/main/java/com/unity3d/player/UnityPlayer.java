package com.unity3d.player;

import android.content.Context;
import android.view.View;

/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayer extends View {

    public UnityPlayer(Context context) {
        super(context);


    }
    public void ss1(){
        int s=0;
        switch (s){
            case 0:
                break;
            case 1:
                System.out.println("src");
                break;
            default:
                System.out.println("list");

        }
    }
    public void ss2(){
        int s=0;
        switch (s){
            case 0:
            case 1:
                break;
            default:
                System.out.println("list");

        }
    }
    
}