package code.fortomorrow.easysharedpref;

import android.content.Context;
import android.content.SharedPreferences;

public class EasySharedPref {

    public static final String SHARED_PREF_MAIN="shared_preference_main";
    private static SharedPreferences mSharedPref;
    public static final String NAME = "initial.name";

    private EasySharedPref()
    {

    }
    public static void init(Context context)
    {
        if(mSharedPref == null)
            mSharedPref = context.getSharedPreferences( NAME, Context.MODE_PRIVATE);
    }

    public static String read(String key, String defValue) {
        return mSharedPref.getString(key, defValue);
    }

    public static void write(String key, String value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putString(key, value);
        prefsEditor.commit();
    }

}
