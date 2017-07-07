.class public Lcom/debugapplication/DebugUtil;
.super Ljava/lang/Object;
.source "DebugUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isWeixinAvilible(Landroid/content/Context;)Z
    .locals 6
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v5, 0x0

    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 45
    .local v1, "packageManager":Landroid/content/pm/PackageManager;
    invoke-virtual {v1, v5}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v2

    .line 46
    .local v2, "pinfo":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;"
    if-eqz v2, :cond_1

    .line 47
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 48
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/PackageInfo;

    iget-object v3, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 49
    .local v3, "pn":Ljava/lang/String;
    const-string v4, "com.tencent.mm"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 50
    const/4 v4, 0x1

    .line 54
    .end local v0    # "i":I
    .end local v3    # "pn":Ljava/lang/String;
    :goto_1
    return v4

    .line 47
    .restart local v0    # "i":I
    .restart local v3    # "pn":Ljava/lang/String;
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .end local v0    # "i":I
    .end local v3    # "pn":Ljava/lang/String;
    :cond_1
    move v4, v5

    .line 54
    goto :goto_1
.end method

.method public static sendFloatMessage()V
    .locals 2

    .prologue
    .line 82
    invoke-static {}, Lcom/debugapplication/DebugHandler;->instance()Lcom/debugapplication/DebugHandler;

    move-result-object v0

    const/16 v1, 0x3045

    invoke-virtual {v0, v1}, Lcom/debugapplication/DebugHandler;->sendEmptyMessage(I)Lcom/debugapplication/DebugHandler;

    .line 83
    return-void
.end method

.method public static setFloat(Landroid/app/Activity;)V
    .locals 3
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 73
    invoke-static {}, Lcom/debugapplication/DebugHandler;->instance()Lcom/debugapplication/DebugHandler;

    move-result-object v0

    const/16 v1, 0x3045

    new-instance v2, Lcom/debugapplication/DebugUtil$1;

    invoke-direct {v2, p0}, Lcom/debugapplication/DebugUtil$1;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lcom/debugapplication/DebugHandler;->addListener(ILcom/debugapplication/DebugHandler$HandlerListener;)Lcom/debugapplication/DebugHandler;

    .line 80
    return-void
.end method

.method public static start3dmWeb1(Landroid/content/Context;)V
    .locals 7
    .param p0, "activity"    # Landroid/content/Context;

    .prologue
    const/4 v6, 0x1

    .line 26
    invoke-static {p0}, Lcom/debugapplication/DebugUtil;->isWeixinAvilible(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 27
    const-string v4, "clipboard"

    .line 28
    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    .line 29
    .local v1, "clipboard":Landroid/content/ClipboardManager;
    const-string v4, "simple text"

    const-string v5, "3DM\u6c49\u5316\u7ec4"

    invoke-static {v4, v5}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    .line 30
    .local v0, "clip":Landroid/content/ClipData;
    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 31
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 32
    .local v3, "intent":Landroid/content/Intent;
    new-instance v2, Landroid/content/ComponentName;

    const-string v4, "com.tencent.mm"

    const-string v5, "com.tencent.mm.ui.LauncherUI"

    invoke-direct {v2, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .local v2, "cmp":Landroid/content/ComponentName;
    const-string v4, "android.intent.action.MAIN"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    const-string v4, "android.intent.category.LAUNCHER"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    const/high16 v4, 0x10000000

    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 36
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-object v4, p0

    .line 37
    check-cast v4, Landroid/app/Activity;

    const/16 v5, 0x7d1

    invoke-virtual {v4, v3, v5}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 38
    const-string v4, "\u5df2\u7ecf\u628a\u516c\u4f17\u53f7\u590d\u5236\u5230\u526a\u5207\u677f\n\u53ef\u4ee5\u65b9\u4fbf\u5173\u6ce8"

    invoke-static {p0, v4, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 42
    .end local v0    # "clip":Landroid/content/ClipData;
    .end local v1    # "clipboard":Landroid/content/ClipboardManager;
    .end local v2    # "cmp":Landroid/content/ComponentName;
    .end local v3    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 40
    :cond_0
    const-string v4, "\u6ca1\u6709\u68c0\u6d4b\u5230\u5fae\u4fe1"

    invoke-static {p0, v4, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public static start3dmWeb2(Landroid/content/Context;)V
    .locals 3
    .param p0, "activity"    # Landroid/content/Context;

    .prologue
    .line 57
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 59
    .local v1, "intent":Landroid/content/Intent;
    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 61
    const-string v2, "http://www.3dmgame.com/"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 62
    .local v0, "content_url":Landroid/net/Uri;
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 63
    check-cast p0, Landroid/app/Activity;

    .end local p0    # "activity":Landroid/content/Context;
    const/16 v2, 0x7d1

    invoke-virtual {p0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 64
    return-void
.end method

.method public static start3dmWeb3(Landroid/content/Context;)V
    .locals 2
    .param p0, "activity"    # Landroid/content/Context;

    .prologue
    .line 67
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/debugapplication/WebActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 69
    .local v0, "intent":Landroid/content/Intent;
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 70
    check-cast p0, Landroid/app/Activity;

    .end local p0    # "activity":Landroid/content/Context;
    const/16 v1, 0x7d1

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 71
    return-void
.end method
