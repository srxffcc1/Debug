.class public Lcom/debugapplication/DebugHandler;
.super Ljava/lang/Object;
.source "DebugHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/debugapplication/DebugHandler$HandlerListener;
    }
.end annotation


# static fields
.field private static handler:Landroid/os/Handler;

.field private static handlerListenerMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/debugapplication/DebugHandler$HandlerListener;",
            ">;"
        }
    .end annotation
.end field

.field private static final instance:Lcom/debugapplication/DebugHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lcom/debugapplication/DebugHandler$1;

    invoke-direct {v0}, Lcom/debugapplication/DebugHandler$1;-><init>()V

    sput-object v0, Lcom/debugapplication/DebugHandler;->handler:Landroid/os/Handler;

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/debugapplication/DebugHandler;->handlerListenerMap:Ljava/util/Map;

    .line 32
    new-instance v0, Lcom/debugapplication/DebugHandler;

    invoke-direct {v0}, Lcom/debugapplication/DebugHandler;-><init>()V

    sput-object v0, Lcom/debugapplication/DebugHandler;->instance:Lcom/debugapplication/DebugHandler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method static synthetic access$000()Ljava/util/Map;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/debugapplication/DebugHandler;->handlerListenerMap:Ljava/util/Map;

    return-object v0
.end method

.method public static instance()Lcom/debugapplication/DebugHandler;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/debugapplication/DebugHandler;->instance:Lcom/debugapplication/DebugHandler;

    return-object v0
.end method


# virtual methods
.method public addListener(ILcom/debugapplication/DebugHandler$HandlerListener;)Lcom/debugapplication/DebugHandler;
    .locals 3
    .param p1, "key"    # I
    .param p2, "value"    # Lcom/debugapplication/DebugHandler$HandlerListener;

    .prologue
    .line 47
    const-string v0, "DebugHandler"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6ce8\u518c:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    sget-object v0, Lcom/debugapplication/DebugHandler;->handlerListenerMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lcom/debugapplication/DebugHandler;->instance:Lcom/debugapplication/DebugHandler;

    return-object v0
.end method

.method public removeListener(I)Lcom/debugapplication/DebugHandler;
    .locals 3
    .param p1, "key"    # I

    .prologue
    .line 52
    const-string v0, "DebugHandler"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u79fb\u9664:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    sget-object v0, Lcom/debugapplication/DebugHandler;->handlerListenerMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Lcom/debugapplication/DebugHandler;->instance:Lcom/debugapplication/DebugHandler;

    return-object v0
.end method

.method public sendEmptyMessage(I)Lcom/debugapplication/DebugHandler;
    .locals 1
    .param p1, "what"    # I

    .prologue
    .line 43
    sget-object v0, Lcom/debugapplication/DebugHandler;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 44
    sget-object v0, Lcom/debugapplication/DebugHandler;->instance:Lcom/debugapplication/DebugHandler;

    return-object v0
.end method

.method public sendMessage(Landroid/os/Message;)Lcom/debugapplication/DebugHandler;
    .locals 1
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 39
    sget-object v0, Lcom/debugapplication/DebugHandler;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 40
    sget-object v0, Lcom/debugapplication/DebugHandler;->instance:Lcom/debugapplication/DebugHandler;

    return-object v0
.end method
