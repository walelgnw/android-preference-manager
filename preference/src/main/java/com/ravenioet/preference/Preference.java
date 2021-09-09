package com.ravenioet.preference;

import android.content.Context;
import android.content.SharedPreferences;
import static android.content.Context.MODE_PRIVATE;

public class Preference {
    public static Preference preference;
    public Context context;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public String DEFAULT_PREF = "def_prex0";
    public String database;
    private Preference(Context ctx, String database_x) {
        context = ctx;
        if(database_x == null){
            database = DEFAULT_PREF;
        }else {
            database = database_x;
        }
        String prefer_db = getUserId()+database;
        sharedPreferences = context.getSharedPreferences(prefer_db, MODE_PRIVATE);
    }
    public static Preference getPrefMan(Context context, String database_x) {
        if (preference == null) {
            preference = new Preference(context,database_x);
        }
        return preference;
    }
    public String getUserId(){
        return "pref_store_user";
        //return UserManager.getInstance(context).spec_user();
    }
    public String getDeviceId(){
        return "pref_store_device";
        //return DeviceManager.getInstance(context).get_device_id();
    }

    public void setBoolean(String name,boolean value){
        editor.putBoolean(name, value);
    }
    public void setInt(String name,int value){
        editor.putInt(name, value);
    }
    public void setUString(String name,String value){
        editor.putString(name, value);
    }
    public void setFloat(String name,float value){
        editor.putFloat(name, value);
    }
    public void setLong(String name,long value){
        editor.putLong(name, value);
    }

    public boolean getBoolean(String name){
        return sharedPreferences.getBoolean(name, false);
    }
    public int getInt(String name){
        return sharedPreferences.getInt(name, -1);
    }
    public String getString(String name){
        return sharedPreferences.getString(name, "m-n-f");
    }
    public float getFloat(String name){
        return sharedPreferences.getFloat(name, 0);
    }
    public long getLong(String name){
        return sharedPreferences.getLong(name, 0);
    }

}
