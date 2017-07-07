.class Lcom/debugapplication/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/debugapplication/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/debugapplication/MainActivity;


# direct methods
.method constructor <init>(Lcom/debugapplication/MainActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/debugapplication/MainActivity;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/debugapplication/MainActivity$1;->this$0:Lcom/debugapplication/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 18
    :try_start_0
    iget-object v1, p0, Lcom/debugapplication/MainActivity$1;->this$0:Lcom/debugapplication/MainActivity;

    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/debugapplication/MainActivity$1;->this$0:Lcom/debugapplication/MainActivity;

    const-string v4, "com.unity3d.player.UnityPlayerActivity"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Lcom/debugapplication/MainActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :goto_0
    iget-object v1, p0, Lcom/debugapplication/MainActivity$1;->this$0:Lcom/debugapplication/MainActivity;

    invoke-virtual {v1}, Lcom/debugapplication/MainActivity;->finish()V

    .line 23
    return-void

    .line 19
    :catch_0
    move-exception v0

    .line 20
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    goto :goto_0
.end method
