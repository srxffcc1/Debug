package home.util;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class ViewLock {
    public static View lockLayoutCenterInInitial(Activity activity, int viewid){
        View result=activity.findViewById(viewid);
//        View result;
        if(result!=null){
            return result;
        }else{
            result=new LinearLayout(activity);
            ((LinearLayout) result).setGravity(Gravity.CENTER);
            result.setId(viewid);
            ViewGroup contentgroup=(ViewGroup) activity.findViewById(android.R.id.content);
            ViewGroup orggroup= (ViewGroup) contentgroup.getChildAt(0);
            contentgroup.removeAllViews();

            FrameLayout frameLayout=new FrameLayout(activity);
//            linearLayout.setOrientation(LinearLayout.VERTICAL);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
            LinearLayout.LayoutParams orgparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams resultparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            orggroup.setLayoutParams(orgparm);
            result.setLayoutParams(resultparm);
            frameLayout.addView(orggroup);
            frameLayout.addView(result);
            contentgroup.addView(frameLayout);
//            ((ViewGroup) result).removeAllViews();
            return result;
        }

    }
    public static View lockLayoutCenterInRoot(Activity activity, int viewid){
        View result=activity.findViewById(viewid);
//        View result;
        if(result!=null){
            return result;
        }else{
            result=new LinearLayout(activity);
            ((LinearLayout) result).setGravity(Gravity.CENTER);
            result.setId(viewid);
            ViewGroup contentgroup=(ViewGroup) activity.findViewById(android.R.id.content).getRootView();
            ViewGroup orggroup= (ViewGroup) contentgroup.getChildAt(0);
            contentgroup.removeAllViews();

            FrameLayout frameLayout=new FrameLayout(activity);
//            linearLayout.setOrientation(LinearLayout.VERTICAL);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
            LinearLayout.LayoutParams orgparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams resultparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            orggroup.setLayoutParams(orgparm);
            result.setLayoutParams(resultparm);
            frameLayout.addView(orggroup);
            frameLayout.addView(result);
            contentgroup.addView(frameLayout);
//            ((ViewGroup) result).removeAllViews();
            return result;
        }

    }
    public static View lockLayoutBottomInInitial(Activity activity, int viewid){
        View result=activity.findViewById(viewid);
//        View result;
        if(result!=null){
            return result;
        }else{
            result=new FrameLayout(activity);
            result.setId(viewid);
            ViewGroup contentgroup=(ViewGroup) activity.findViewById(android.R.id.content);
            ViewGroup orggroup= (ViewGroup) contentgroup.getChildAt(0);
            contentgroup.removeAllViews();

            LinearLayout linearLayout=new LinearLayout(activity);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
            LinearLayout.LayoutParams orgparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1f);
            LinearLayout.LayoutParams resultparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            orggroup.setLayoutParams(orgparm);
            result.setLayoutParams(resultparm);
            linearLayout.addView(orggroup);
            linearLayout.addView(result);
            contentgroup.addView(linearLayout);
//            ((ViewGroup) result).removeAllViews();
            return result;
        }

    }
    public static View lockLayoutInInitial(Activity activity, int viewid){
        View result=activity.findViewById(viewid);
//        View result;
        if(result!=null){
            return result;
        }else{
            result=new LinearLayout(activity);
//            ((LinearLayout) result).setGravity(Gravity.CENTER);
            result.setId(viewid);
            ViewGroup contentgroup=(ViewGroup) activity.findViewById(android.R.id.content);
            ViewGroup orggroup= (ViewGroup) contentgroup.getChildAt(0);
            contentgroup.removeAllViews();

            FrameLayout frameLayout=new FrameLayout(activity);
//            linearLayout.setOrientation(LinearLayout.VERTICAL);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
            LinearLayout.LayoutParams orgparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams resultparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            orggroup.setLayoutParams(orgparm);
            result.setLayoutParams(resultparm);
            frameLayout.addView(orggroup);
            frameLayout.addView(result);
            contentgroup.addView(frameLayout);
//            ((ViewGroup) result).removeAllViews();
            return result;
        }

    }
    public static View lockLayoutInRoot(Activity activity, int viewid){
        View result=activity.findViewById(viewid);
//        View result;
        if(result!=null){
            return result;
        }else{
            result=new FrameLayout(activity);
            result.setId(viewid);
            ViewGroup contentgroup=(ViewGroup) activity.findViewById(android.R.id.content).getRootView();
            ViewGroup orggroup= (ViewGroup) contentgroup.getChildAt(0);
            contentgroup.removeAllViews();

            FrameLayout frameLayout=new FrameLayout(activity);
//            linearLayout.setOrientation(LinearLayout.VERTICAL);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
            LinearLayout.LayoutParams orgparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams resultparm=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            orggroup.setLayoutParams(orgparm);
            result.setLayoutParams(resultparm);
            frameLayout.addView(orggroup);
            frameLayout.addView(result);
            contentgroup.addView(frameLayout);
//            ((ViewGroup) result).removeAllViews();
            return result;
        }

    }
}
