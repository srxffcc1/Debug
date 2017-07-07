.class public Lcom/debugapplication/DragLayout;
.super Landroid/widget/RelativeLayout;
.source "DragLayout.java"


# instance fields
.field private mDragger:Landroid/support/v4/widget/ViewDragHelper;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 19
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/debugapplication/DragLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/debugapplication/DragLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    const/high16 v0, 0x3f800000    # 1.0f

    new-instance v1, Lcom/debugapplication/DragLayout$1;

    invoke-direct {v1, p0}, Lcom/debugapplication/DragLayout$1;-><init>(Lcom/debugapplication/DragLayout;)V

    invoke-static {p0, v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/debugapplication/DragLayout;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    .line 66
    return-void
.end method

.method static synthetic access$000(Lcom/debugapplication/DragLayout;Landroid/view/View;)V
    .locals 0
    .param p0, "x0"    # Lcom/debugapplication/DragLayout;
    .param p1, "x1"    # Landroid/view/View;

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/debugapplication/DragLayout;->moveToSide(Landroid/view/View;)V

    return-void
.end method

.method private moveToSide(Landroid/view/View;)V
    .locals 8
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const/4 v5, 0x0

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v4

    int-to-float v3, v4

    .line 70
    .local v3, "top":F
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v6

    sub-int/2addr v4, v6

    int-to-float v0, v4

    .line 71
    .local v0, "bottom":F
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v6

    sub-int/2addr v4, v6

    int-to-float v2, v4

    .line 72
    .local v2, "right":F
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v4

    int-to-float v1, v4

    .line 74
    .local v1, "left":F
    cmpg-float v4, v3, v0

    if-gez v4, :cond_0

    move v4, v3

    :goto_0
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->getMeasuredHeight()I

    move-result v6

    int-to-float v6, v6

    div-float v6, v4, v6

    cmpg-float v4, v2, v1

    if-gez v4, :cond_1

    move v4, v2

    :goto_1
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->getMeasuredWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v4, v7

    cmpg-float v4, v6, v4

    if-gez v4, :cond_3

    .line 75
    iget-object v6, p0, Lcom/debugapplication/DragLayout;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v7

    cmpg-float v4, v3, v0

    if-gez v4, :cond_2

    move v4, v5

    :goto_2
    invoke-virtual {v6, v7, v4}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    .line 80
    :goto_3
    return-void

    :cond_0
    move v4, v0

    .line 74
    goto :goto_0

    :cond_1
    move v4, v1

    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    sub-int/2addr v4, v5

    goto :goto_2

    .line 78
    :cond_3
    iget-object v4, p0, Lcom/debugapplication/DragLayout;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    cmpg-float v6, v1, v2

    if-gez v6, :cond_4

    :goto_4
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v6

    invoke-virtual {v4, v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->getMeasuredWidth()I

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    sub-int/2addr v5, v6

    goto :goto_4
.end method


# virtual methods
.method public computeScroll()V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/debugapplication/DragLayout;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->invalidate()V

    .line 98
    :cond_0
    return-void
.end method

.method protected onFinishInflate()V
    .locals 3

    .prologue
    .line 102
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 103
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lcom/debugapplication/DragLayout;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 104
    invoke-virtual {p0, v0}, Lcom/debugapplication/DragLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 103
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 106
    :cond_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 84
    iget-object v0, p0, Lcom/debugapplication/DragLayout;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 89
    iget-object v0, p0, Lcom/debugapplication/DragLayout;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V

    .line 90
    const/4 v0, 0x0

    return v0
.end method
