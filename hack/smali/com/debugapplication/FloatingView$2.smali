.class Lcom/debugapplication/FloatingView$2;
.super Ljava/lang/Object;
.source "FloatingView.java"

# interfaces
.implements Lcom/debugapplication/FloatingView$OnFloatClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/debugapplication/FloatingView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
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
    .line 183
    iput-object p1, p0, Lcom/debugapplication/FloatingView$2;->this$0:Lcom/debugapplication/FloatingView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public floatClick(Landroid/view/View;)V
    .locals 0
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 187
    return-void
.end method

.method public floatCloseClick()V
    .locals 0

    .prologue
    .line 192
    return-void
.end method
