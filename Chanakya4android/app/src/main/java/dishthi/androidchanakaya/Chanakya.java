package dishthi.androidchanakaya;


import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by ganesh on 12/15/2016.
 */
public class Chanakya {


    public static String chat(String req)
    {
      
        String res = "Hello "+req;
      //    ChanakyaRestHelper.getInstance().excutePost("http://anybodycanteach.com:8080",str);
        return res;
    }

    public static String getMetadata(Context context, String keyname) {
        try {
            ApplicationInfo appInfo = context.getPackageManager().getApplicationInfo(
                    context.getPackageName(), PackageManager.GET_META_DATA);
            if (appInfo.metaData != null) {
                return appInfo.metaData.getString(keyname);
            }
        } catch (PackageManager.NameNotFoundException e) {

        }

        return null;
    }

}
