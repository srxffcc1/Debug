.class public Lcom/unity3d/player/UnityPlayerActivity;
.super Landroid/app/Activity;
.source "UnityPlayerActivity.java"


# instance fields
.field mUnityPlayer:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private onCreateEnd()V
    .locals 4

    .prologue
    .line 75
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/unity3d/player/UnityPlayerActivity$2;

    invoke-direct {v1, p0}, Lcom/unity3d/player/UnityPlayerActivity$2;-><init>(Lcom/unity3d/player/UnityPlayerActivity;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 81
    invoke-static {p0}, Lcom/debugapplication/DebugUtil;->setFloat(Landroid/app/Activity;)V

    .line 82
    return-void
.end method

.method private onCreateStartToReplaceSetContentView(Landroid/view/View;)V
    .locals 12
    .param p1, "viewneed"    # Landroid/view/View;

    .prologue
    const/4 v11, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v9, -0x1

    .line 35
    new-instance v4, Landroid/widget/FrameLayout;

    invoke-direct {v4, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 36
    .local v4, "parent":Landroid/widget/FrameLayout;
    new-instance v5, Landroid/widget/FrameLayout;

    invoke-direct {v5, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 37
    .local v5, "playercontent":Landroid/widget/FrameLayout;
    new-instance v2, Lcom/debugapplication/DragLayout;

    invoke-direct {v2, p0}, Lcom/debugapplication/DragLayout;-><init>(Landroid/content/Context;)V

    .line 38
    .local v2, "dragLayout":Lcom/debugapplication/DragLayout;
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v8}, Lcom/debugapplication/DragLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 40
    .local v0, "backlinear":Landroid/widget/LinearLayout;
    const v8, 0x7f07000a

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setId(I)V

    .line 41
    const/4 v8, 0x1

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 42
    const-string v8, "d3mback.png"

    invoke-static {p0, v8}, Lcom/debugapplication/ImageUtilz;->loadImageFromAsserts(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 43
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 45
    .local v6, "textView1":Landroid/widget/TextView;
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v9, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 47
    .local v7, "textView2":Landroid/widget/TextView;
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v9, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 49
    .local v1, "d3mlogo":Landroid/widget/ImageView;
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v9, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    sget-object v8, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 51
    const-string v8, "d3mlogo.png"

    invoke-static {p0, v8}, Lcom/debugapplication/ImageUtilz;->loadImageFromAsserts(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 52
    new-instance v3, Lcom/debugapplication/FloatingView;

    invoke-direct {v3, p0}, Lcom/debugapplication/FloatingView;-><init>(Landroid/content/Context;)V

    .line 53
    .local v3, "floatingView":Lcom/debugapplication/FloatingView;
    const v8, 0x7f07000b

    invoke-virtual {v3, v8}, Lcom/debugapplication/FloatingView;->setId(I)V

    .line 54
    new-instance v8, Lcom/unity3d/player/UnityPlayerActivity$1;

    invoke-direct {v8, p0}, Lcom/unity3d/player/UnityPlayerActivity$1;-><init>(Lcom/unity3d/player/UnityPlayerActivity;)V

    invoke-virtual {v3, v8}, Lcom/debugapplication/FloatingView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    const-string v8, "splash23dm.png"

    invoke-static {p0, v8}, Lcom/debugapplication/ImageUtilz;->loadImageFromAsserts(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/debugapplication/FloatingView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v9, 0x1ae

    const/16 v10, 0xaf

    invoke-direct {v8, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v8}, Lcom/debugapplication/FloatingView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    sget-object v8, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v8}, Lcom/debugapplication/FloatingView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 63
    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 65
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 66
    invoke-virtual {v2, v0}, Lcom/debugapplication/DragLayout;->addView(Landroid/view/View;)V

    .line 67
    invoke-virtual {v2, v3}, Lcom/debugapplication/DragLayout;->addView(Landroid/view/View;)V

    .line 68
    invoke-virtual {v5, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 69
    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 70
    invoke-virtual {v4, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 71
    invoke-virtual {p0, v4}, Lcom/unity3d/player/UnityPlayerActivity;->setContentView(Landroid/view/View;)V

    .line 72
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 25
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayerActivity;->requestWindowFeature(I)Z

    .line 26
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 28
    new-instance v0, Lcom/unity3d/player/UnityPlayer;

    invoke-direct {v0, p0}, Lcom/unity3d/player/UnityPlayer;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    .line 29
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayerActivity;->onCreateStartToReplaceSetContentView(Landroid/view/View;)V

    .line 30
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v0}, Lcom/unity3d/player/UnityPlayer;->requestFocus()Z

    .line 31
    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onCreateEnd()V

    .line 32
    return-void
.end method

.method public start3dmWeb(Landroid/view/View;)V
    .locals 0
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 85
    invoke-static {p0}, Lcom/debugapplication/DebugUtil;->start3dmWeb3(Landroid/content/Context;)V

    .line 86
    return-void
.end method
