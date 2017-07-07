.class Lcom/debugapplication/TmpActivity$Test2Fragment;
.super Landroid/app/Fragment;
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
    name = "Test2Fragment"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/debugapplication/TmpActivity;


# direct methods
.method constructor <init>(Lcom/debugapplication/TmpActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/debugapplication/TmpActivity;

    .prologue
    .line 40
    iput-object p1, p0, Lcom/debugapplication/TmpActivity$Test2Fragment;->this$0:Lcom/debugapplication/TmpActivity;

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

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

    .prologue
    .line 44
    invoke-virtual {p0}, Lcom/debugapplication/TmpActivity$Test2Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 45
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
