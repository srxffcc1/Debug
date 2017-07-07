.class Lcom/debugapplication/FloatingView$3;
.super Ljava/lang/Object;
.source "FloatingView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/debugapplication/FloatingView;->toggle(ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/debugapplication/FloatingView;

.field final synthetic val$animate:Z

.field final synthetic val$visible:Z


# direct methods
.method constructor <init>(Lcom/debugapplication/FloatingView;ZZ)V
    .locals 0
    .param p1, "this$0"    # Lcom/debugapplication/FloatingView;

    .prologue
    .line 336
    iput-object p1, p0, Lcom/debugapplication/FloatingView$3;->this$0:Lcom/debugapplication/FloatingView;

    iput-boolean p2, p0, Lcom/debugapplication/FloatingView$3;->val$visible:Z

    iput-boolean p3, p0, Lcom/debugapplication/FloatingView$3;->val$animate:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 5

    .prologue
    .line 339
    iget-object v1, p0, Lcom/debugapplication/FloatingView$3;->this$0:Lcom/debugapplication/FloatingView;

    invoke-virtual {v1}, Lcom/debugapplication/FloatingView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 340
    .local v0, "currentVto":Landroid/view/ViewTreeObserver;
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 341
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 343
    :cond_0
    iget-object v1, p0, Lcom/debugapplication/FloatingView$3;->this$0:Lcom/debugapplication/FloatingView;

    iget-boolean v2, p0, Lcom/debugapplication/FloatingView$3;->val$visible:Z

    iget-boolean v3, p0, Lcom/debugapplication/FloatingView$3;->val$animate:Z

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lcom/debugapplication/FloatingView;->access$000(Lcom/debugapplication/FloatingView;ZZZ)V

    .line 344
    const/4 v1, 0x0

    return v1
.end method
