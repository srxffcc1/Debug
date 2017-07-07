.class Lcom/debugapplication/TmpActivity$TestFragment;
.super Landroid/support/v4/app/Fragment;
.source "TmpActivity.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ValidFragment"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/debugapplication/TmpActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TestFragment"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/debugapplication/TmpActivity;


# direct methods
.method constructor <init>(Lcom/debugapplication/TmpActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/debugapplication/TmpActivity;

    .prologue
    .line 31
    iput-object p1, p0, Lcom/debugapplication/TmpActivity$TestFragment;->this$0:Lcom/debugapplication/TmpActivity;

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/debugapplication/TmpActivity$TestFragment;->this$0:Lcom/debugapplication/TmpActivity;

    invoke-virtual {v0}, Lcom/debugapplication/TmpActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    .line 36
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
