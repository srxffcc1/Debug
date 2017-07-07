.class public Lcom/debugapplication/ListenerApplication;
.super Landroid/app/Application;
.source "ListenerApplication.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/debugapplication/ListenerApplication$BusinessActivityCallbacks;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .prologue
    .line 15
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 16
    new-instance v0, Lcom/debugapplication/ListenerApplication$BusinessActivityCallbacks;

    invoke-direct {v0, p0}, Lcom/debugapplication/ListenerApplication$BusinessActivityCallbacks;-><init>(Lcom/debugapplication/ListenerApplication;)V

    invoke-virtual {p0, v0}, Lcom/debugapplication/ListenerApplication;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 17
    return-void
.end method
