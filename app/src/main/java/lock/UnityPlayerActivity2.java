package lock;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.ssicosm.slime_great_war.R;

import lock.hacks.StringConvert;


/**
 * Created by Administrator on 2017/6/4.
 */

public class UnityPlayerActivity2 extends Activity {

    private static Activity activity;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);

    }
    public void ss(){
        String str="";
        str=new String();
        str= StringConvert.convert(str);
    }
    public void openWeb(){
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri content_url = Uri.parse("http://app.3dmgame.com/android/6_1_1.html");
        intent.setData(content_url);
        activity.startActivity(intent);
    }
}
