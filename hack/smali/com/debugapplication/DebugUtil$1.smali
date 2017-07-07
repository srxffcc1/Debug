.class final Lcom/debugapplication/DebugUtil$1;
.super Ljava/lang/Object;
.source "DebugUtil.java"

# interfaces
.implements Lcom/debugapplication/DebugHandler$HandlerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/debugapplication/DebugUtil;->setFloat(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/debugapplication/DebugUtil$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hand(Landroid/os/Message;)V
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 76
    iget-object v0, p0, Lcom/debugapplication/DebugUtil$1;->val$activity:Landroid/app/Activity;

    const v1, 0x7f07000b

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 77
    return-void
.end method
