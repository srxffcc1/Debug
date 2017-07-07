.class public Lcom/unity3d/player/UnityPlayer;
.super Landroid/view/View;
.source "UnityPlayer.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 15
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-static {}, Lcom/debugapplication/DebugUtil;->sendFloatMessage()V

    .line 17
    return-void
.end method
