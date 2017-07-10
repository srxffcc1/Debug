package com.debugapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

/**
 * Created by King6rf on 2017/7/6.
 */

public class WebActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.debug_main);

        FrameLayout parent=new FrameLayout(this);
        webView = new WebView(this);
        setContentView(parent);
        parent.addView(webView);
        WebSettings webSettings = webView.getSettings();
//设置 缓存模式
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
// 开启 DOM storage API 功能
        webView.getSettings().setDomStorageEnabled(true);
        // 设置与Js交互的权限
        webSettings.setJavaScriptEnabled(true);
        // 设置允许JS弹窗
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setUseWideViewPort(true);//关键点


//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
//        webSettings.setDomStorageEnabled(true);
//        webSettings.setDatabaseEnabled(true);
//        webSettings.setAppCacheEnabled(true);
//        webSettings.setAllowFileAccess(true);
//        webSettings.setSavePassword(true);
//        webSettings.setSupportZoom(true);
//        webSettings.setBuiltInZoomControls(true);
//
//        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
//        webSettings.setUseWideViewPort(true);
//
//        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
//        webView.setHorizontalScrollbarOverlay(true);
//        webView.setHorizontalScrollBarEnabled(true);
//        webView.requestFocus();

        // 步骤1：加载JS代码
        // 格式规定为:file:///android_asset/文件名.html
        webView.loadUrl("http://app.3dmgame.com/news/13349.html");
//        webView.loadUrl("http://218.76.17.6/acs/login/index");
//        webView.loadUrl("file:///android_asset/test.html");
        webView.setWebViewClient(new WebViewClient() {
                                     @Override
                                     public boolean shouldOverrideUrlLoading(WebView view, String url) {

                                         // 步骤2：根据协议的参数，判断是否是所需要的url
                                         // 一般根据scheme（协议格式） & authority（协议名）判断（前两个参数）
                                         //假定传入进来的 url = "js://webview?arg1=111&arg2=222"（同时也是约定好的需要拦截的）

                                         Uri uri = Uri.parse(url);
                                         // 如果url的协议 = 预先约定的 js 协议
                                         // 就解析往下解析参数
                                         if (uri.getScheme().equals("weixin")) {

                                             // 如果 authority  = 预先约定协议里的 webview，即代表都符合约定的协议
                                             // 所以拦截url,下面JS开始调用Android需要的方法
                                            startWeiXin();

                                             return true;
                                         }
                                         return super.shouldOverrideUrlLoading(view, url);
                                     }

                                     @RequiresApi(api = Build.VERSION_CODES.M)
                                     @Override
                                     public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                                         super.onReceivedError(view, request, error);
                                         System.out.println("出错了"+error.getErrorCode());
                                         startWeiXin();
                                     }

                                     @Override
                                     public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                                         super.onReceivedError(view, errorCode, description, failingUrl);
                                         System.out.println("出错了"+errorCode);
                                         startWeiXin();
                                     }
                                 }
        );

    }
    protected void onDestroy() {
        super.onDestroy();
        webView.removeAllViews();
        webView.destroy();
    }
    public void startWeiXin() {
        DebugUtil.start3dmWeb1(this);
        finish();
    }
}
