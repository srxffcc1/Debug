.class public Lcom/debugapplication/TmpActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "TmpActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/debugapplication/TmpActivity$Test2Fragment;,
        Lcom/debugapplication/TmpActivity$TestFragment;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 27
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 28
    invoke-virtual {p0}, Lcom/debugapplication/TmpActivity;->finish()V

    .line 29
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 19
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    invoke-static {p0}, Lcom/debugapplication/DebugUtil;->start3dmWeb2(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0}, Lcom/debugapplication/TmpActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    .line 22
    invoke-virtual {p0}, Lcom/debugapplication/TmpActivity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 23
    return-void
.end method
