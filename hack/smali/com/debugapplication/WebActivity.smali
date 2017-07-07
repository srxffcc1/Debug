.class public Lcom/debugapplication/WebActivity;
.super Landroid/app/Activity;
.source "WebActivity.java"


# instance fields
.field private webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v4, 0x1

    .line 26
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 29
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 30
    .local v0, "parent":Landroid/widget/FrameLayout;
    new-instance v2, Landroid/webkit/WebView;

    invoke-direct {v2, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    .line 31
    invoke-virtual {p0, v0}, Lcom/debugapplication/WebActivity;->setContentView(Landroid/view/View;)V

    .line 32
    iget-object v2, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 33
    iget-object v2, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    .line 35
    .local v1, "webSettings":Landroid/webkit/WebSettings;
    iget-object v2, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 37
    iget-object v2, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 39
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 41
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 42
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 46
    iget-object v2, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    const-string v3, "http://app.3dmgame.com/news/13349.html"

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 48
    iget-object v2, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    new-instance v3, Lcom/debugapplication/WebActivity$1;

    invoke-direct {v3, p0}, Lcom/debugapplication/WebActivity$1;-><init>(Lcom/debugapplication/WebActivity;)V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 87
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 89
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 90
    iget-object v0, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 91
    iget-object v0, p0, Lcom/debugapplication/WebActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 92
    return-void
.end method

.method public startWeiXin()V
    .locals 0

    .prologue
    .line 94
    invoke-static {p0}, Lcom/debugapplication/DebugUtil;->start3dmWeb1(Landroid/content/Context;)V

    .line 95
    invoke-virtual {p0}, Lcom/debugapplication/WebActivity;->finish()V

    .line 96
    return-void
.end method
