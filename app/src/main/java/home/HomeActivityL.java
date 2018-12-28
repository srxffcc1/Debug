package home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;

import home.util.InGViewAll;

public class HomeActivityL extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout=new FrameLayout(this);
        setContentView(frameLayout);
        InGViewAll.loadNativeExpressADL(this);
//        InGViewAll.loadNativeExpressAD(this);
    }
    public static void start(Context context){
        context.startActivity(new Intent(context, HomeActivityL.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
