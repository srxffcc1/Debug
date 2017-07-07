.class Lcom/unity3d/player/UnityPlayerActivity$1;
.super Ljava/lang/Object;
.source "UnityPlayerActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayerActivity;->onCreateStartToReplaceSetContentView(Landroid/view/View;)V
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
    .line 54
    iput-object p1, p0, Lcom/unity3d/player/UnityPlayerActivity$1;->this$0:Lcom/unity3d/player/UnityPlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 57
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity$1;->this$0:Lcom/unity3d/player/UnityPlayerActivity;

    invoke-virtual {v0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->start3dmWeb(Landroid/view/View;)V

    .line 58
    return-void
.end method
