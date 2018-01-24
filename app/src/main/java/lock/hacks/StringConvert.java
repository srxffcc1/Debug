package lock.hacks;

/**
 * Created by Administrator on 2018/1/24.
 */

public class StringConvert {
    public static String convert(String org){
        char[] orgarray=org.toCharArray();
        if(orgarray.length>0){
            if((orgarray[0]+"").getBytes().length>1){
                return "中文";
            }
        }

        return org;
    }
}
