.class Lcom/unity3d/player/UnityPlayerActivity$2;
.super Ljava/lang/Object;
.source "UnityPlayerActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayerActivity;->onCreateEnd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/unity3d/player/UnityPlayerActivity;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayerActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/unity3d/player/UnityPlayerActivity;

    .prologue
    .line 75
    iput-object p1, p0, Lcom/unity3d/player/UnityPlayerActivity$2;->this$0:Lcom/unity3d/player/UnityPlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity$2;->this$0:Lcom/unity3d/player/UnityPlayerActivity;

    const v1, 0x7f07000a

    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 79
    return-void
.end method
