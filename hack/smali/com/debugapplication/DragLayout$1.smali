.class Lcom/debugapplication/DragLayout$1;
.super Landroid/support/v4/widget/ViewDragHelper$Callback;
.source "DragLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/debugapplication/DragLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/debugapplication/DragLayout;


# direct methods
.method constructor <init>(Lcom/debugapplication/DragLayout;)V
    .locals 0
    .param p1, "this$0"    # Lcom/debugapplication/DragLayout;

    .prologue
    .line 28
    iput-object p1, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 5
    .param p1, "child"    # Landroid/view/View;
    .param p2, "left"    # I
    .param p3, "dx"    # I

    .prologue
    .line 36
    iget-object v3, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-virtual {v3}, Lcom/debugapplication/DragLayout;->getPaddingLeft()I

    move-result v0

    .line 37
    .local v0, "leftBound":I
    iget-object v3, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-virtual {v3}, Lcom/debugapplication/DragLayout;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    sub-int v2, v3, v0

    .line 38
    .local v2, "rightBound":I
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 39
    .local v1, "newLeft":I
    return v1
.end method

.method public clampViewPositionVertical(Landroid/view/View;II)I
    .locals 5
    .param p1, "child"    # Landroid/view/View;
    .param p2, "top"    # I
    .param p3, "dy"    # I

    .prologue
    .line 44
    iget-object v3, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-virtual {v3}, Lcom/debugapplication/DragLayout;->getPaddingTop()I

    move-result v2

    .line 45
    .local v2, "topBound":I
    iget-object v3, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-virtual {v3}, Lcom/debugapplication/DragLayout;->getHeight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    sub-int v0, v3, v4

    .line 46
    .local v0, "bottomBound":I
    invoke-static {p2, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 47
    .local v1, "newTop":I
    return v1
.end method

.method public getViewHorizontalDragRange(Landroid/view/View;)I
    .locals 2
    .param p1, "child"    # Landroid/view/View;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-virtual {v0}, Lcom/debugapplication/DragLayout;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public getViewVerticalDragRange(Landroid/view/View;)I
    .locals 2
    .param p1, "child"    # Landroid/view/View;

    .prologue
    .line 57
    iget-object v0, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-virtual {v0}, Lcom/debugapplication/DragLayout;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public onViewReleased(Landroid/view/View;FF)V
    .locals 1
    .param p1, "releasedChild"    # Landroid/view/View;
    .param p2, "xvel"    # F
    .param p3, "yvel"    # F

    .prologue
    .line 62
    iget-object v0, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-static {v0, p1}, Lcom/debugapplication/DragLayout;->access$000(Lcom/debugapplication/DragLayout;Landroid/view/View;)V

    .line 63
    iget-object v0, p0, Lcom/debugapplication/DragLayout$1;->this$0:Lcom/debugapplication/DragLayout;

    invoke-virtual {v0}, Lcom/debugapplication/DragLayout;->invalidate()V

    .line 64
    return-void
.end method

.method public tryCaptureView(Landroid/view/View;I)Z
    .locals 1
    .param p1, "child"    # Landroid/view/View;
    .param p2, "pointerId"    # I

    .prologue
    .line 31
    const/4 v0, 0x1

    return v0
.end method
