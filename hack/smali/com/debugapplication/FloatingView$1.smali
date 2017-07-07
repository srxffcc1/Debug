.class Lcom/debugapplication/FloatingView$1;
.super Ljava/lang/Object;
.source "FloatingView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/debugapplication/FloatingView;->taskChange()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/debugapplication/FloatingView;


# direct methods
.method constructor <init>(Lcom/debugapplication/FloatingView;)V
    .locals 0
    .param p1, "this$0"    # Lcom/debugapplication/FloatingView;

    .prologue
    .line 158
    iput-object p1, p0, Lcom/debugapplication/FloatingView$1;->this$0:Lcom/debugapplication/FloatingView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/debugapplication/FloatingView$1;->this$0:Lcom/debugapplication/FloatingView;

    invoke-virtual {v0}, Lcom/debugapplication/FloatingView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/debugapplication/FloatingView$1;->this$0:Lcom/debugapplication/FloatingView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/debugapplication/FloatingView;->setVisibility(I)V

    .line 165
    :cond_0
    return-void
.end method
