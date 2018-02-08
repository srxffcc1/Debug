package lock.hacks;

import android.content.Context;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018/1/24.
 */

public class StringConvert {

    private static Properties properties;

    public static void init(Context context){

        try {
            properties = new Properties();
            InputStream is=context.getAssets().open("dmtran.properties");
            properties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String convert(String org){
//        Log.v("info","start");
        if(properties!=null){
            try {
                String result=properties.getProperty(org);
                if(result!=null&&!result.equals("")){
                    System.out.println(result);
//                    Log.i("info","ok");
                    return result.toString();
                }
//                Log.e("info","error");
                return org;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return org;
    }
}
