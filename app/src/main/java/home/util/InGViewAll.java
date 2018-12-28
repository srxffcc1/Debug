package home.util;

import android.app.Activity;
import android.content.Intent;

import java.util.Random;

import home.HomeActivityL;
import home.HomeActivityP;

public class InGViewAll {
    public static void loadNativeExpressADP(Activity activity){
        int random=new Random().nextInt(ViewHome.NativeExpressPosIDP.length);
        ViewPop.loadNativeExpressAD(activity,0x7f07004a,ViewHome.APPID,ViewHome.NativeExpressPosIDP[random],-1,-2);
    }
    public static void loadNativeExpressADL(Activity activity){
        int random=new Random().nextInt(ViewHome.NativeExpressPosIDL.length);
        ViewPop.loadNativeExpressAD(activity,0x7f07004a,ViewHome.APPID,ViewHome.NativeExpressPosIDL[random],-1,-2);
    }
    public static void loadNativeVideoAD(Activity activity){
//        ViewPop.loadNativeVideoAD(activity,0x7f07004a,ViewHome.APPID,ViewHome.NativeExpressPosID);
    }
    public static void loadSplashAD(Activity activity){
        ViewPop.loadSplashAD(activity,0x7f07002a,ViewHome.APPID,ViewHome.SplashPosID);
    }
    public static void loadInterstitialAD(Activity activity){

            ViewPop.loadInterstitialAD(activity,0x7f07003a,ViewHome.APPID,ViewHome.InterteristalPosID,1);
    }
    public static void loadBannerAD(Activity activity){
        ViewPop.loadBannerAD(activity,0x7f07001a,ViewHome.APPID,ViewHome.BannerPosID);
    }
    public static void loadNativeExpressAD(Activity activity){
        int random=new Random().nextInt(3);
        if(random==2){
            activity.startActivity(new Intent(activity,HomeActivityL.class));
        }else{
            activity.startActivity(new Intent(activity, HomeActivityP.class));
        }
    }
}
