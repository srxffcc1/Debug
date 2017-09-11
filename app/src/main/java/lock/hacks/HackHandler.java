package lock.hacks;

import android.os.Handler;
import android.os.Message;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by King6rf on 2017/7/6.
 */

public class HackHandler {
    private static Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
//            Log.v("DebugHandler","分配:"+msg.what+"");
            HandlerListener listener=handlerListenerMap.get(msg.what);
            if(listener!=null){
//                Log.v("DebugHandler","开始:"+msg.what+"");
                listener.hand(msg);
            }
        }
    };
    private static Map<Integer,HandlerListener> handlerListenerMap=new HashMap<>();

    public interface HandlerListener {
        void hand(Message msg);
    }
    private static final HackHandler instance=new HackHandler();
    private HackHandler(){
    }
    public static HackHandler instance(){
        return instance;
    }
    public HackHandler sendMessage(Message msg){
        handler.sendMessage(msg);
        return instance;
    }
    public HackHandler sendEmptyMessage(int what){
        handler.sendEmptyMessage(what);
        return instance;
    }
    public HackHandler addListener(int key, HandlerListener value){
//        Log.v("DebugHandler","注册:"+key);
        handlerListenerMap.put(key,value);
        return instance;
    }
    public HackHandler removeListener(int... key){
//        Log.v("DebugHandler","移除:"+key);
        for (int i : key) {
            handlerListenerMap.remove(i);
        }

        return instance;
    }
}
