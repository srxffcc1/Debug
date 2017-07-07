.class public Lcom/debugapplication/FloatingView;
.super Landroid/widget/ImageView;
.source "FloatingView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/debugapplication/FloatingView$OnFloatClickListener;
    }
.end annotation


# static fields
.field private static final DELETE_DEFAULT_WIDTH:I = 0x14

.field private static final MAX_HEIGHT:I = 0x5a

.field private static final MAX_WIDTH:I = 0x5a

.field private static final TAQ:Ljava/lang/String;

.field private static final TRANSLATE_DURATION_MILLIS:I = 0xc8


# instance fields
.field private isSetColor:Z

.field public isshow:Z

.field private mBitmap:Landroid/graphics/Bitmap;

.field private mBitmapHeight:I

.field private mBitmapWidth:I

.field private mContext:Landroid/content/Context;

.field private mDeleteColor:I

.field private mHeight:I

.field private final mInterpolator:Landroid/view/animation/Interpolator;

.field private mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

.field private mMarginSet:Z

.field private mMatrix:Landroid/graphics/Matrix;

.field private mNeedAnimation:Z

.field private mOnFloatClickListener:Lcom/debugapplication/FloatingView$OnFloatClickListener;

.field private mPaint:Landroid/graphics/Paint;

.field private mScrollThreshold:I

.field private mVisible:Z

.field private mWidth:I

.field needdrawsrc:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/debugapplication/FloatingView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/debugapplication/FloatingView;->TAQ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/debugapplication/FloatingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v1, 0x1

    .line 74
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 64
    iput-boolean v1, p0, Lcom/debugapplication/FloatingView;->isshow:Z

    .line 107
    iput-boolean v1, p0, Lcom/debugapplication/FloatingView;->needdrawsrc:Z

    .line 75
    invoke-direct {p0, p1, p2}, Lcom/debugapplication/FloatingView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 76
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    const/4 v1, 0x1

    .line 78
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 64
    iput-boolean v1, p0, Lcom/debugapplication/FloatingView;->isshow:Z

    .line 107
    iput-boolean v1, p0, Lcom/debugapplication/FloatingView;->needdrawsrc:Z

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/debugapplication/FloatingView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 80
    return-void
.end method

.method static synthetic access$000(Lcom/debugapplication/FloatingView;ZZZ)V
    .locals 0
    .param p0, "x0"    # Lcom/debugapplication/FloatingView;
    .param p1, "x1"    # Z
    .param p2, "x2"    # Z
    .param p3, "x3"    # Z

    .prologue
    .line 40
    invoke-direct {p0, p1, p2, p3}, Lcom/debugapplication/FloatingView;->toggle(ZZZ)V

    return-void
.end method

.method private createLayerDrawable()Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/16 v4, 0xa0

    .line 207
    iget-object v1, p0, Lcom/debugapplication/FloatingView;->mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

    if-nez v1, :cond_0

    .line 208
    const/4 v1, 0x2

    new-array v0, v1, [Landroid/graphics/drawable/Drawable;

    .line 209
    .local v0, "layers":[Landroid/graphics/drawable/Drawable;
    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "float_ad_close_background.png"

    invoke-static {v2, v3, v4}, Lcom/debugapplication/ImageUtilz;->loadImageFromAsserts(Landroid/content/Context;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v0, v1

    .line 210
    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "float_ad_close.png"

    invoke-static {v2, v3, v4}, Lcom/debugapplication/ImageUtilz;->loadImageFromAsserts(Landroid/content/Context;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v0, v1

    .line 211
    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v1, p0, Lcom/debugapplication/FloatingView;->mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

    .line 213
    .end local v0    # "layers":[Landroid/graphics/drawable/Drawable;
    :cond_0
    iget-object v1, p0, Lcom/debugapplication/FloatingView;->mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {p0, v1}, Lcom/debugapplication/FloatingView;->drawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1
.end method

.method private createLayerDrawable(I)Landroid/graphics/Bitmap;
    .locals 7
    .param p1, "color"    # I

    .prologue
    const/16 v6, 0xa0

    const/4 v5, 0x0

    .line 218
    iget-object v2, p0, Lcom/debugapplication/FloatingView;->mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

    if-nez v2, :cond_0

    .line 219
    const/4 v2, 0x2

    new-array v1, v2, [Landroid/graphics/drawable/Drawable;

    .line 220
    .local v1, "layers":[Landroid/graphics/drawable/Drawable;
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "float_ad_close_background.png"

    invoke-static {v2, v3, v6}, Lcom/debugapplication/ImageUtilz;->loadImageFromAsserts(Landroid/content/Context;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v1, v5

    .line 221
    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "float_ad_close.png"

    invoke-static {v3, v4, v6}, Lcom/debugapplication/ImageUtilz;->loadImageFromAsserts(Landroid/content/Context;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    aput-object v3, v1, v2

    .line 222
    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v2, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v2, p0, Lcom/debugapplication/FloatingView;->mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

    .line 224
    .end local v1    # "layers":[Landroid/graphics/drawable/Drawable;
    :cond_0
    iget-object v2, p0, Lcom/debugapplication/FloatingView;->mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v2, v5}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 225
    .local v0, "background":Landroid/graphics/drawable/Drawable;
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 226
    iget-object v2, p0, Lcom/debugapplication/FloatingView;->mLayerDrawable:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {p0, v2}, Lcom/debugapplication/FloatingView;->drawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v2

    return-object v2
.end method

.method private dip2px(Landroid/content/Context;F)I
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "dpValue"    # F

    .prologue
    .line 405
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    .line 406
    .local v0, "scale":F
    mul-float v1, p2, v0

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    return v1
.end method

.method private getDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p1, "id"    # I
        .annotation build Landroid/support/annotation/DimenRes;
        .end annotation
    .end param

    .prologue
    .line 380
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private getMarginBottom()I
    .locals 3

    .prologue
    .line 367
    const/4 v1, 0x0

    .line 368
    .local v1, "marginBottom":I
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 369
    .local v0, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    instance-of v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_0

    .line 370
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .end local v0    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 372
    :cond_0
    return v1
.end method

.method private getTypedArray(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attributeSet"    # Landroid/util/AttributeSet;
    .param p3, "attr"    # [I

    .prologue
    const/4 v0, 0x0

    .line 204
    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    return-object v0
.end method

.method private hasHoneycombApi()Z
    .locals 2

    .prologue
    .line 246
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attributeSet"    # Landroid/util/AttributeSet;

    .prologue
    const/high16 v1, 0x41a00000    # 20.0f

    .line 170
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/debugapplication/FloatingView;->mVisible:Z

    .line 171
    iput-object p1, p0, Lcom/debugapplication/FloatingView;->mContext:Landroid/content/Context;

    .line 172
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mPaint:Landroid/graphics/Paint;

    .line 173
    iget-object v0, p0, Lcom/debugapplication/FloatingView;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/debugapplication/FloatingView;->dip2px(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/debugapplication/FloatingView;->mBitmapWidth:I

    .line 174
    iget-object v0, p0, Lcom/debugapplication/FloatingView;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/debugapplication/FloatingView;->dip2px(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/debugapplication/FloatingView;->mBitmapHeight:I

    .line 175
    iget-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 176
    invoke-direct {p0}, Lcom/debugapplication/FloatingView;->createLayerDrawable()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    .line 178
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mMatrix:Landroid/graphics/Matrix;

    .line 180
    if-eqz p2, :cond_1

    .line 181
    invoke-direct {p0, p1, p2}, Lcom/debugapplication/FloatingView;->initAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 183
    :cond_1
    new-instance v0, Lcom/debugapplication/FloatingView$2;

    invoke-direct {v0, p0}, Lcom/debugapplication/FloatingView$2;-><init>(Lcom/debugapplication/FloatingView;)V

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mOnFloatClickListener:Lcom/debugapplication/FloatingView$OnFloatClickListener;

    .line 194
    return-void
.end method

.method private initAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attributeSet"    # Landroid/util/AttributeSet;

    .prologue
    .line 201
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/debugapplication/FloatingView;->mNeedAnimation:Z

    .line 202
    return-void
.end method

.method private setMargins()V
    .locals 6

    .prologue
    .line 230
    iget-boolean v5, p0, Lcom/debugapplication/FloatingView;->mMarginSet:Z

    if-nez v5, :cond_0

    .line 231
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v5, v5, Landroid/view/ViewGroup$LayoutParams;

    if-eqz v5, :cond_0

    .line 232
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 233
    .local v2, "lp":Landroid/view/ViewGroup$MarginLayoutParams;
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 234
    .local v1, "leftMargin":I
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 235
    .local v4, "topMargin":I
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 236
    .local v3, "rightMargin":I
    iget v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 237
    .local v0, "bottomMargin":I
    invoke-virtual {v2, v1, v4, v3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 239
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->requestLayout()V

    .line 240
    const/4 v5, 0x1

    iput-boolean v5, p0, Lcom/debugapplication/FloatingView;->mMarginSet:Z

    .line 243
    .end local v0    # "bottomMargin":I
    .end local v1    # "leftMargin":I
    .end local v2    # "lp":Landroid/view/ViewGroup$MarginLayoutParams;
    .end local v3    # "rightMargin":I
    .end local v4    # "topMargin":I
    :cond_0
    return-void
.end method

.method private taskChange()V
    .locals 4

    .prologue
    .line 158
    new-instance v0, Lcom/debugapplication/FloatingView$1;

    invoke-direct {v0, p0}, Lcom/debugapplication/FloatingView$1;-><init>(Lcom/debugapplication/FloatingView;)V

    const-wide/32 v2, 0xea60

    invoke-virtual {p0, v0, v2, v3}, Lcom/debugapplication/FloatingView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 167
    return-void
.end method

.method private toggle(ZZZ)V
    .locals 6
    .param p1, "visible"    # Z
    .param p2, "animate"    # Z
    .param p3, "force"    # Z

    .prologue
    .line 330
    iget-boolean v3, p0, Lcom/debugapplication/FloatingView;->mVisible:Z

    if-ne v3, p1, :cond_0

    if-eqz p3, :cond_1

    .line 331
    :cond_0
    iput-boolean p1, p0, Lcom/debugapplication/FloatingView;->mVisible:Z

    .line 332
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getHeight()I

    move-result v0

    .line 333
    .local v0, "height":I
    if-nez v0, :cond_2

    if-nez p3, :cond_2

    .line 334
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    .line 335
    .local v2, "vto":Landroid/view/ViewTreeObserver;
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 336
    new-instance v3, Lcom/debugapplication/FloatingView$3;

    invoke-direct {v3, p0, p1, p2}, Lcom/debugapplication/FloatingView$3;-><init>(Lcom/debugapplication/FloatingView;ZZ)V

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 364
    .end local v0    # "height":I
    .end local v2    # "vto":Landroid/view/ViewTreeObserver;
    :cond_1
    :goto_0
    return-void

    .line 350
    .restart local v0    # "height":I
    :cond_2
    if-eqz p1, :cond_3

    const/4 v1, 0x0

    .line 351
    .local v1, "translationY":I
    :goto_1
    if-eqz p2, :cond_4

    .line 352
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v3

    iget-object v4, p0, Lcom/debugapplication/FloatingView;->mInterpolator:Landroid/view/animation/Interpolator;

    invoke-virtual {v3, v4}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v3

    const-wide/16 v4, 0xc8

    .line 353
    invoke-virtual {v3, v4, v5}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->setDuration(J)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v3

    int-to-float v4, v1

    .line 354
    invoke-virtual {v3, v4}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->translationY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    .line 360
    :goto_2
    invoke-direct {p0}, Lcom/debugapplication/FloatingView;->hasHoneycombApi()Z

    move-result v3

    if-nez v3, :cond_1

    .line 361
    invoke-virtual {p0, p1}, Lcom/debugapplication/FloatingView;->setClickable(Z)V

    goto :goto_0

    .line 350
    .end local v1    # "translationY":I
    :cond_3
    invoke-direct {p0}, Lcom/debugapplication/FloatingView;->getMarginBottom()I

    move-result v3

    add-int v1, v0, v3

    goto :goto_1

    .line 356
    .restart local v1    # "translationY":I
    :cond_4
    int-to-float v3, v1

    invoke-virtual {p0, v3}, Lcom/debugapplication/FloatingView;->setTranslationY(F)V

    goto :goto_2
.end method


# virtual methods
.method public drawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 411
    const/4 v0, 0x0

    .line 413
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    instance-of v3, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v3, :cond_0

    move-object v1, p1

    .line 414
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 415
    .local v1, "bitmapDrawable":Landroid/graphics/drawable/BitmapDrawable;
    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 416
    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 429
    .end local v1    # "bitmapDrawable":Landroid/graphics/drawable/BitmapDrawable;
    :goto_0
    return-object v3

    .line 420
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    if-gtz v3, :cond_2

    .line 421
    :cond_1
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v4, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 426
    :goto_1
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 427
    .local v2, "canvas":Landroid/graphics/Canvas;
    iget v3, p0, Lcom/debugapplication/FloatingView;->mBitmapWidth:I

    iget v4, p0, Lcom/debugapplication/FloatingView;->mBitmapHeight:I

    invoke-virtual {p1, v6, v6, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 428
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    move-object v3, v0

    .line 429
    goto :goto_0

    .line 423
    .end local v2    # "canvas":Landroid/graphics/Canvas;
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_1
.end method

.method public hideAnimation(Z)V
    .locals 1
    .param p1, "animate"    # Z

    .prologue
    const/4 v0, 0x0

    .line 326
    invoke-direct {p0, v0, p1, v0}, Lcom/debugapplication/FloatingView;->toggle(ZZZ)V

    .line 327
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 123
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 125
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 110
    iget-boolean v0, p0, Lcom/debugapplication/FloatingView;->needdrawsrc:Z

    if-eqz v0, :cond_0

    .line 111
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 113
    :cond_0
    iget-boolean v0, p0, Lcom/debugapplication/FloatingView;->isSetColor:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/debugapplication/FloatingView;->mDeleteColor:I

    if-eqz v0, :cond_1

    .line 114
    iget v0, p0, Lcom/debugapplication/FloatingView;->mDeleteColor:I

    invoke-direct {p0, v0}, Lcom/debugapplication/FloatingView;->createLayerDrawable(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    .line 118
    :goto_0
    iget-object v0, p0, Lcom/debugapplication/FloatingView;->mMatrix:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/debugapplication/FloatingView;->mWidth:I

    iget v2, p0, Lcom/debugapplication/FloatingView;->mBitmapHeight:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/debugapplication/FloatingView;->mContext:Landroid/content/Context;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-direct {p0, v2, v3}, Lcom/debugapplication/FloatingView;->dip2px(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 119
    iget-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/debugapplication/FloatingView;->mMatrix:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/debugapplication/FloatingView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 120
    return-void

    .line 116
    :cond_1
    invoke-direct {p0}, Lcom/debugapplication/FloatingView;->createLayerDrawable()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public onGlobalLayout()V
    .locals 2

    .prologue
    .line 435
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 436
    iget-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 438
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    .line 442
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 6
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    const/high16 v5, 0x40000000    # 2.0f

    const/high16 v4, -0x80000000

    const/high16 v3, 0x42b40000    # 90.0f

    .line 84
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 85
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 86
    .local v0, "specMode":I
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 87
    .local v1, "specSize":I
    if-ne v0, v5, :cond_2

    .line 88
    iput v1, p0, Lcom/debugapplication/FloatingView;->mWidth:I

    .line 93
    :cond_0
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 94
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 95
    if-ne v0, v5, :cond_3

    .line 96
    iput v1, p0, Lcom/debugapplication/FloatingView;->mHeight:I

    .line 101
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/debugapplication/FloatingView;->setMargins()V

    .line 103
    iget v2, p0, Lcom/debugapplication/FloatingView;->mWidth:I

    iget v3, p0, Lcom/debugapplication/FloatingView;->mHeight:I

    invoke-virtual {p0, v2, v3}, Lcom/debugapplication/FloatingView;->setMeasuredDimension(II)V

    .line 106
    return-void

    .line 89
    :cond_2
    if-ne v0, v4, :cond_0

    .line 90
    iget-object v2, p0, Lcom/debugapplication/FloatingView;->mContext:Landroid/content/Context;

    invoke-direct {p0, v2, v3}, Lcom/debugapplication/FloatingView;->dip2px(Landroid/content/Context;F)I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Lcom/debugapplication/FloatingView;->mWidth:I

    goto :goto_0

    .line 97
    :cond_3
    if-ne v0, v4, :cond_1

    .line 98
    iget-object v2, p0, Lcom/debugapplication/FloatingView;->mContext:Landroid/content/Context;

    invoke-direct {p0, v2, v3}, Lcom/debugapplication/FloatingView;->dip2px(Landroid/content/Context;F)I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Lcom/debugapplication/FloatingView;->mHeight:I

    goto :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 128
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 154
    :cond_0
    :goto_0
    return v2

    .line 130
    :pswitch_0
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->isClickable()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/debugapplication/FloatingView;->needdrawsrc:Z

    if-eqz v1, :cond_0

    .line 131
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->performClick()Z

    .line 132
    invoke-direct {p0}, Lcom/debugapplication/FloatingView;->taskChange()V

    goto :goto_0

    .line 136
    :pswitch_1
    iget-object v1, p0, Lcom/debugapplication/FloatingView;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    .line 137
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v4, p0, Lcom/debugapplication/FloatingView;->mWidth:I

    iget v5, p0, Lcom/debugapplication/FloatingView;->mBitmapWidth:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    cmpl-float v1, v1, v4

    if-lez v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v4, p0, Lcom/debugapplication/FloatingView;->mBitmapHeight:I

    int-to-float v4, v4

    cmpg-float v1, v1, v4

    if-gez v1, :cond_1

    move v0, v2

    .line 138
    .local v0, "touchable":Z
    :goto_1
    if-eqz v0, :cond_3

    .line 139
    iget-boolean v1, p0, Lcom/debugapplication/FloatingView;->needdrawsrc:Z

    if-nez v1, :cond_2

    move v1, v2

    :goto_2
    iput-boolean v1, p0, Lcom/debugapplication/FloatingView;->needdrawsrc:Z

    .line 140
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->invalidate()V

    .line 141
    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lcom/debugapplication/FloatingView;->setVisibility(I)V

    .line 142
    invoke-direct {p0}, Lcom/debugapplication/FloatingView;->taskChange()V

    .line 143
    iget-object v1, p0, Lcom/debugapplication/FloatingView;->mOnFloatClickListener:Lcom/debugapplication/FloatingView$OnFloatClickListener;

    invoke-interface {v1}, Lcom/debugapplication/FloatingView$OnFloatClickListener;->floatCloseClick()V

    .line 144
    invoke-virtual {p0, v3}, Lcom/debugapplication/FloatingView;->setClickable(Z)V

    goto :goto_0

    .end local v0    # "touchable":Z
    :cond_1
    move v0, v3

    .line 137
    goto :goto_1

    .restart local v0    # "touchable":Z
    :cond_2
    move v1, v3

    .line 139
    goto :goto_2

    .line 146
    :cond_3
    invoke-virtual {p0, v2}, Lcom/debugapplication/FloatingView;->setClickable(Z)V

    .line 147
    iget-object v1, p0, Lcom/debugapplication/FloatingView;->mOnFloatClickListener:Lcom/debugapplication/FloatingView$OnFloatClickListener;

    invoke-interface {v1, p0}, Lcom/debugapplication/FloatingView$OnFloatClickListener;->floatClick(Landroid/view/View;)V

    goto :goto_0

    .line 128
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setCloseColor(I)V
    .locals 1
    .param p1, "color"    # I

    .prologue
    .line 449
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/debugapplication/FloatingView;->isSetColor:Z

    .line 450
    iput p1, p0, Lcom/debugapplication/FloatingView;->mDeleteColor:I

    .line 451
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->invalidate()V

    .line 452
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "bm"    # Landroid/graphics/Bitmap;

    .prologue
    .line 456
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 457
    invoke-virtual {p0}, Lcom/debugapplication/FloatingView;->invalidate()V

    .line 458
    return-void
.end method

.method public setOnFloatClickListener(Lcom/debugapplication/FloatingView$OnFloatClickListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/debugapplication/FloatingView$OnFloatClickListener;

    .prologue
    .line 376
    iput-object p1, p0, Lcom/debugapplication/FloatingView;->mOnFloatClickListener:Lcom/debugapplication/FloatingView$OnFloatClickListener;

    .line 377
    return-void
.end method

.method public showAnimation(Z)V
    .locals 2
    .param p1, "animate"    # Z

    .prologue
    .line 322
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/debugapplication/FloatingView;->toggle(ZZZ)V

    .line 323
    return-void
.end method
