package home.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import com.qq.e.ads.banner.ADSize;
import com.qq.e.ads.banner.AbstractBannerADListener;
import com.qq.e.ads.banner.BannerADListener;
import com.qq.e.ads.banner.BannerView;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.interstitial.AbstractInterstitialADListener;
import com.qq.e.ads.interstitial.InterstitialAD;
import com.qq.e.ads.interstitial.InterstitialADListener;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.ads.nativ.NativeMediaAD;
import com.qq.e.ads.nativ.NativeMediaADData;
import com.qq.e.ads.splash.SplashAD;
import com.qq.e.ads.splash.SplashADListener;
import com.qq.e.comm.constants.AdPatternType;
import com.qq.e.comm.pi.AdData;
import com.qq.e.comm.util.AdError;

import java.util.List;

public class ViewPop {

    private static final String TAG = ViewPop.class.getSimpleName();
    public static final void hideSoftInput(Activity activity) {

        try {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0); //强制隐藏键盘
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static String getAdInfo(NativeExpressADView nativeExpressADView) {
        AdData adData = nativeExpressADView.getBoundData();
        if (adData != null) {
            StringBuilder infoBuilder = new StringBuilder();
            infoBuilder.append("title:").append(adData.getTitle()).append(",")
                    .append("desc:").append(adData.getDesc()).append(",")
                    .append("patternType:").append(adData.getAdPatternType());
            if (adData.getAdPatternType() == AdPatternType.NATIVE_VIDEO) {
                infoBuilder.append(", video info: ").append(getVideoInfo(adData.getProperty(AdData.VideoPlayer.class)));
            }
            return infoBuilder.toString();
        }
        return null;
    }
    private static String getVideoInfo(AdData.VideoPlayer videoPlayer) {
        if (videoPlayer != null) {
            StringBuilder videoBuilder = new StringBuilder();
            videoBuilder.append("{state:").append(videoPlayer.getVideoState()).append(",")
                    .append("duration:").append(videoPlayer.getDuration()).append(",")
                    .append("position:").append(videoPlayer.getCurrentPosition()).append("}");
            return videoBuilder.toString();
        }
        return null;
    }
    public static final void loadNativeExpressAD(final Activity activity, final int viewid, final String appid, final String posid, final int width, final int height){
        final ViewGroup lauout= (ViewGroup) ViewLock.lockLayoutCenterInInitial(activity,viewid);
        NativeExpressAD nativeExpressAD = null;
        if(lauout.getTag()!=null){
            nativeExpressAD= (NativeExpressAD) lauout.getTag();

        }else{
            try {
                final NativeExpressMediaListener mediaListener = new NativeExpressMediaListener() {
                    @Override
                    public void onVideoInit(NativeExpressADView nativeExpressADView) {
                        Log.i(TAG, "onVideoInit: "
                                + getVideoInfo(nativeExpressADView.getBoundData().getProperty(AdData.VideoPlayer.class)));
                    }

                    @Override
                    public void onVideoLoading(NativeExpressADView nativeExpressADView) {
                        Log.i(TAG, "onVideoLoading");
                    }

                    @Override
                    public void onVideoReady(NativeExpressADView nativeExpressADView, long l) {
                        Log.i(TAG, "onVideoReady");
                    }

                    @Override
                    public void onVideoStart(NativeExpressADView nativeExpressADView) {
                        Log.i(TAG, "onVideoStart: "
                                + getVideoInfo(nativeExpressADView.getBoundData().getProperty(AdData.VideoPlayer.class)));
                    }

                    @Override
                    public void onVideoPause(NativeExpressADView nativeExpressADView) {
                        Log.i(TAG, "onVideoPause: "
                                + getVideoInfo(nativeExpressADView.getBoundData().getProperty(AdData.VideoPlayer.class)));
                    }

                    @Override
                    public void onVideoComplete(NativeExpressADView nativeExpressADView) {
                        Log.i(TAG, "onVideoComplete: "
                                + getVideoInfo(nativeExpressADView.getBoundData().getProperty(AdData.VideoPlayer.class)));
                    }

                    @Override
                    public void onVideoError(NativeExpressADView nativeExpressADView, AdError adError) {
                        try {
                            nativeExpressADView.destroy();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Log.i(TAG, "onVideoError");
                    }

                    @Override
                    public void onVideoPageOpen(NativeExpressADView nativeExpressADView) {
                        Log.i(TAG, "onVideoPageOpen");
                    }

                    @Override
                    public void onVideoPageClose(NativeExpressADView nativeExpressADView) {
                        Log.i(TAG, "onVideoPageClose");
                    }
                };
                nativeExpressAD= new NativeExpressAD(activity, new com.qq.e.ads.nativ.ADSize(width, height), appid, posid, new NativeExpressAD.NativeExpressADListener() {


                    @Override
                    public void onRenderFail(NativeExpressADView adView) {
                        Log.i(TAG, "onRenderFail");
                    }

                    @Override
                    public void onRenderSuccess(NativeExpressADView adView) {
                        Log.i(TAG, "onRenderSuccess");
                    }

                    @Override
                    public void onADExposure(NativeExpressADView adView) {
                        Log.i(TAG, "onADExposure");
                    }

                    @Override
                    public void onADClicked(NativeExpressADView adView) {
                        Log.i(TAG, "onADClicked");
                    }

                    @Override
                    public void onADClosed(NativeExpressADView adView) {
                        Log.i(TAG, "onADClosed");
                        // 当广告模板中的关闭按钮被点击时，广告将不再展示。NativeExpressADView也会被Destroy，释放资源，不可以再用来展示。
                        if (lauout != null && lauout.getChildCount() > 0) {
                            lauout.removeAllViews();
                            lauout.setVisibility(View.GONE);
                        }
                    }
                    @Override
                    public void onADLoaded(List<NativeExpressADView> list) {
                        for (int i = 0; i <list.size() ; i++) {
                            lauout.removeAllViews();
                            NativeExpressADView nativeExpressADView = list.get(i);
                            Log.i(TAG, "onADLoaded, video info: " + getAdInfo(nativeExpressADView));
                            if (nativeExpressADView.getBoundData().getAdPatternType() == AdPatternType.NATIVE_VIDEO) {
                                nativeExpressADView.setMediaListener(mediaListener);
                            }
                            // 广告可见才会产生曝光，否则将无法产生收益。
                            lauout.addView(nativeExpressADView);
                            nativeExpressADView.render();
                        }

                    }

                    @Override
                    public void onADLeftApplication(NativeExpressADView adView) {
                        Log.i(TAG, "onADLeftApplication");
                    }

                    @Override
                    public void onADOpenOverlay(NativeExpressADView adView) {
                        Log.i(TAG, "onADOpenOverlay");
                    }

                    @Override
                    public void onADCloseOverlay(NativeExpressADView adView) {
                        Log.i(TAG, "onADCloseOverlay");
                    }


                    @Override
                    public void onNoAD(AdError adError) {
                        lauout.removeAllViews();
                        Log.i(TAG, String.format("onNoAD, error code: %d, error msg: %s", adError.getErrorCode(),
                                adError.getErrorMsg()));
                    }
                }); // 这里的Context必须为Activity
                nativeExpressAD.setVideoOption(new VideoOption.Builder()
                        .setAutoPlayPolicy(VideoOption.AutoPlayPolicy.WIFI) // 设置什么网络环境下可以自动播放视频
                        .setAutoPlayMuted(true) // 设置自动播放视频时，是否静音
                        .build());
            } catch (Exception e) {
                e.printStackTrace();
            }
            lauout.setTag(nativeExpressAD);

        }
        lauout.postDelayed(new Runnable() {
            @Override
            public void run() {
                lauout.removeAllViews();
                loadNativeExpressAD( activity,  viewid,   appid,   posid, width, height);
            }
        },5000);
        nativeExpressAD.loadAD(ViewHome.SIZE);

    }
    public static final void loadNativeVideoAD(final Activity activity, final int viewid, final String appid, final String posid){
        final ViewGroup lauout= (ViewGroup) ViewLock.lockLayoutInInitial(activity,viewid);
        final MediaView mMediaView;
        NativeMediaAD mADManager = null;
        if(lauout.getTag()!=null){
            mADManager= (NativeMediaAD) lauout.getTag();
        }else{
            mMediaView=new com.qq.e.ads.nativ.MediaView(activity);
            mMediaView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
            lauout.addView(mMediaView);
            mADManager = new NativeMediaAD(activity.getApplicationContext(), appid, posid, new NativeMediaAD.NativeMediaADListener() {
                @Override
                public void onADLoaded(List<NativeMediaADData> list) {
                    for (int i = 0; i < list.size(); i++) {
                        NativeMediaADData mAD = list.get(i);

                        mAD.onExposured(lauout);
                        if (mAD.getAdPatternType() == AdPatternType.NATIVE_VIDEO) {
                            /**
                             * 如果该条原生广告是一条带有视频素材的广告，还需要先调用preLoadVideo接口来加载视频素材：
                             *    - 加载成功：回调NativeMediaADListener.onADVideoLoaded(NativeMediaADData adData)方法
                             *    - 加载失败：回调NativeMediaADListener.onADError(NativeMediaADData adData, int errorCode)方法，错误码为700
                             */
                            mAD.preLoadVideo();
                            Log.e(TAG,"getAdPatternType() == AdPatternType.NATIVE_VIDEO：" + "这是一条视频广告");
                        } else if (mAD.getAdPatternType() == AdPatternType.NATIVE_2IMAGE_2TEXT) {
                            /**
                             * 如果该条原生广告只是一个普通图文的广告，不带视频素材，那么渲染普通的UI即可。
                             */
                            Log.e(TAG,"getAdPatternType() == AdPatternType.NATIVE_2IMAGE_2TEXT：" + "这是一条两图两文广告");
                        } else if (mAD.getAdPatternType() == AdPatternType.NATIVE_3IMAGE) {
                            Log.e(TAG,"getAdPatternType() == AdPatternType.NATIVE_3IMAGE：" + "这是一条三小图广告");
                        }else{
                            Log.e(TAG,"getAdPatternType() == AdPatternType.NATIVE_VIDEO：" + "这是一条错误广告");
                        }
                    }

                }

                @Override
                public void onADStatusChanged(NativeMediaADData nativeMediaADData) {

                }

                @Override
                public void onADError(NativeMediaADData nativeMediaADData, AdError adError) {
                    try {
                        nativeMediaADData.destroy();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Log.i(TAG, nativeMediaADData.getTitle() + " onADError, error code: " + adError.getErrorCode()
                            + ", error msg: " + adError.getErrorMsg());
                }

                @Override
                public void onADVideoLoaded(NativeMediaADData nativeMediaADData) {
                    Log.i(TAG, nativeMediaADData.getTitle() + " ---> 视频素材加载完成"); // 仅仅是加载视频文件完成，如果没有绑定MediaView视频仍然不可以播放
                    nativeMediaADData.bindView(mMediaView,true);
                    nativeMediaADData.play();
                }

                @Override
                public void onADExposure(NativeMediaADData nativeMediaADData) {

                    Log.i(TAG, nativeMediaADData.getTitle() + " onADExposure");
                }

                @Override
                public void onADClicked(NativeMediaADData nativeMediaADData) {

                }

                @Override
                public void onNoAD(AdError adError) {
                    Log.i(TAG,String.format("广告加载失败，错误码：%d，错误信息：%s", adError.getErrorCode(),
                            adError.getErrorMsg()));
                }
            });
            lauout.setTag(mADManager);
        }

        mADManager.loadAD(ViewHome.SIZE);// 原生广告manager，用于管理广告数据的加载，监听广告回调

    }
    public static final void loadInterstitialAD(final Activity activity, final int viewid, final String appid, final String posid, final int type){//1 pop 2 正常
        SharedPreferences sp=activity.getSharedPreferences("lock",Activity.MODE_PRIVATE);
        long loadstatus=sp.getLong("loadInterstitialAD"+viewid,0);
        long now=System.currentTimeMillis();
        if(now-loadstatus>ViewHome.TIME){
            System.out.println("loadInterstitialADStart");
            loadInterstitialLoopAD(activity,viewid,appid, posid,type);
            sp.edit().putLong("loadInterstitialAD"+viewid,System.currentTimeMillis()).commit();
        }
    }
    public static final void loadInterstitialLoopAD(final Activity activity, final int viewid, final String appid, final String posid, final int type){//1 pop 2 正常
        final ViewGroup lauout= (ViewGroup) ViewLock.lockLayoutInInitial(activity,viewid);
        final SharedPreferences sp=activity.getSharedPreferences("lock",Activity.MODE_PRIVATE);
        lauout.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadInterstitialLoopAD( activity, viewid, appid, posid,type);
            }
        },15000);
        final InterstitialAD interstitialAD;
        if(lauout.getTag()!=null){
//            System.out.println("bannerView-has");
            interstitialAD= (InterstitialAD) lauout.getTag();
        }else{
            interstitialAD=new InterstitialAD(activity,appid, posid);
            interstitialAD.setADListener(new InterstitialADListener() {

                @Override
                public void onNoAD(AdError error) {
                    try {
                        interstitialAD.destroy();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Log.i(
                            "AD_DEMO",
                            String.format("LoadInterstitialAd Fail, error code: %d, error msg: %s",
                                    error.getErrorCode(), error.getErrorMsg()));
                }

                @Override
                public void onADOpened() {

                }

                @Override
                public void onADExposure() {

                }

                @Override
                public void onADClicked() {

                }

                @Override
                public void onADLeftApplication() {

                }

                @Override
                public void onADClosed() {
                    sp.edit().putLong("loadInterstitialAD"+viewid,System.currentTimeMillis()).commit();
                }

                @Override
                public void onADReceive() {
                    Log.i("AD_DEMO", "onADReceive");
                    if(!activity.isFinishing()){
                        if(type==1){

                            interstitialAD.showAsPopupWindow();
                        }else{

                            interstitialAD.show();
                        }
                    }

                }
            });
            lauout.setTag(interstitialAD);
        }
        interstitialAD.loadAD();
        hideSoftInput(activity);
    }
    public static void fetchSplashAD(Activity activity, ViewGroup adContainer, View skipContainer,String appId, String posId, SplashADListener adListener, int fetchDelay) {
         new SplashAD(activity, adContainer, skipContainer, appId, posId, adListener, fetchDelay);
    }
    public static final void loadSplashAD(final Activity activity, final int viewid, final String appid, final String posid){
        final  int minSplashTimeWhenNoAD = 2000;
        final long fetchSplashADTime = System.currentTimeMillis();
        final ViewGroup lauout= (ViewGroup) ViewLock.lockLayoutInInitial(activity,viewid);
        fetchSplashAD(activity, lauout, null, appid, posid, new SplashADListener() {
            @Override
            public void onADDismissed() {

            }

            @Override
            public void onNoAD(AdError adError) {
                Log.i(
                        "AD_DEMO",
                        String.format("LoadSplashADFail, eCode=%d, errorMsg=%s", adError.getErrorCode(),
                                adError.getErrorMsg()));
                long alreadyDelayMills = System.currentTimeMillis() - fetchSplashADTime;//从拉广告开始到onNoAD已经消耗了多少时间
                long shouldDelayMills = alreadyDelayMills > minSplashTimeWhenNoAD ? 0 : minSplashTimeWhenNoAD
                        - alreadyDelayMills;
                lauout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        activity.finish();
                        lauout.removeAllViews();
                    }
                },shouldDelayMills);
            }

            @Override
            public void onADPresent() {

            }

            @Override
            public void onADClicked() {

            }

            @Override
            public void onADTick(long millisUntilFinished) {
                Log.i("AD_DEMO", "SplashADTick " + millisUntilFinished + "ms");
            }

            @Override
            public void onADExposure() {

            }
        }, 0);
    }
    public static final void loadBannerAD(final Activity activity, final int viewid, final String appid, final String posid){
        SharedPreferences sp=activity.getSharedPreferences("lock",Activity.MODE_PRIVATE);
        long loadstatus=sp.getLong("loadBanner"+viewid,0);
        long now=System.currentTimeMillis();
        if(now-loadstatus>ViewHome.TIME){
            System.out.println("loopstart");
            loadBannerLoopAD(activity,viewid,appid, posid);
            sp.edit().putLong("loadBanner"+viewid,System.currentTimeMillis()).commit();
        }
    }
    public static final void loadBannerLoopAD(final Activity activity, final int viewid, final String appid, final String posid){
        final SharedPreferences sp=activity.getSharedPreferences("lock",Activity.MODE_PRIVATE);
            final ViewGroup lauout= (ViewGroup) ViewLock.lockLayoutBottomInInitial(activity,viewid);
            lauout.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(sp.getBoolean("loadBannerLoop",true)){
                    loadBannerLoopAD( activity, viewid, appid, posid);
                    }
                }
            },5000);
            final BannerView bannerView;
            if(lauout.getTag()!=null){
//            System.out.println("bannerView-has");
                bannerView= (BannerView) lauout.getTag();
            }else{
//            System.out.println("bannerView-null");
                bannerView=new BannerView(activity, ADSize.BANNER, appid,posid);
                bannerView.setRefresh(10);
                bannerView.setADListener(new BannerADListener() {

                    @Override
                    public void onNoAD(AdError error) {
                        try {
                            bannerView.destroy();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Log.i(
                                "AD_DEMO",
                                String.format("Banner onNoAD，eCode = %d, eMsg = %s", error.getErrorCode(), error.getErrorMsg()));
                    }

                    @Override
                    public void onADReceiv() {
                        Log.i("AD_DEMO", "ONBannerReceive");
                    }

                    @Override
                    public void onADExposure() {

                    }

                    @Override
                    public void onADClosed() {

                    }

                    @Override
                    public void onADClicked() {

                    }

                    @Override
                    public void onADLeftApplication() {

                    }

                    @Override
                    public void onADOpenOverlay() {

                    }

                    @Override
                    public void onADCloseOverlay() {

                    }
                });
                bannerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sp.edit().putBoolean("loadBannerLoop",false).commit();
                            bannerView.destroy();
                            lauout.setTag(null);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                },ViewHome.TIME);
                lauout.addView(bannerView);
                lauout.setTag(bannerView);
            }
            hideSoftInput(activity);
            bannerView.loadAD();

    }

}
