package com.ravenioet.preference;

import android.content.Context;
import android.content.SharedPreferences;
import static android.content.Context.MODE_PRIVATE;

public class Preference {
    public static Preference afrihealthCoreTool;
    public Context context;
    SharedPreferences sharedPreferences = null;
    PrefModel model = null;
    private Preference(Context ctx) {
        context = ctx;
    }
    public static Preference getPrefMan(Context context) {
        if (afrihealthCoreTool == null) {
            afrihealthCoreTool = new Preference(context);
        }
        return afrihealthCoreTool;
    }
    public String getManifestUser(){
        return "pref_store_user";
        //return UserManager.getInstance(context).spec_user();
    }
    public String getDeviceId(){
        return "pref_store_device";
        //return DeviceManager.getInstance(context).get_device_id();
    }

    public boolean user_pref(PrefModel preference){
        String prefer_db = getManifestUser()+preference.getPref_name();
        sharedPreferences = context.getSharedPreferences(prefer_db, MODE_PRIVATE);
        model = preference;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        switch (preference.getData_type()){
            case 1:
                //int
                editor.putInt(preference.getData_name(), preference.getInt_data());
                break;
            case 2:
                //string
                editor.putString(preference.getData_name(), preference.getString_data());
                break;
            case 3:
                //float
                editor.putFloat(preference.getData_name(), preference.getFloat_data());
                break;
            case 4:
                //long
                editor.putLong(preference.getData_name(), preference.getLong_data());
                break;
            case 5:
                //boolean
                editor.putBoolean(preference.getData_name(), preference.getBoolean_data());
                break;
        }
        editor.apply();
        return editor.commit();
    }
    public boolean isUTrue(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getManifestUser()+ model.getPref_name(), MODE_PRIVATE);
        return sharedPreferences.getBoolean(name, false);
    }
    public int getUInt(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getManifestUser()+ model.getPref_name(), MODE_PRIVATE);
        return sharedPreferences.getInt(name, -1);
    }
    public String getUString(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getManifestUser()+ model.getPref_name(), MODE_PRIVATE);
        return sharedPreferences.getString(name, "m-n-f");
    }
    public float getUFloat(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getManifestUser()+ model.getPref_name(), MODE_PRIVATE);
        return sharedPreferences.getFloat(name, 0);
    }
    public long getULong(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getManifestUser()+ model.getPref_name(), MODE_PRIVATE);
        return sharedPreferences.getLong(name, 0);
    }

    public boolean system_pref(PrefModel preference){
        String prefer_db = getDeviceId()+preference.getPref_name();
        sharedPreferences = context.getSharedPreferences(prefer_db, MODE_PRIVATE);
        model = preference;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        switch (preference.getData_type()){
            case 1:
                //int
                editor.putInt(preference.getData_name(), preference.getInt_data());
                break;
            case 2:
                //string
                editor.putString(preference.getData_name(), preference.getString_data());
                break;
            case 3:
                //float
                editor.putFloat(preference.getData_name(), preference.getFloat_data());
                break;
            case 4:
                //long
                editor.putLong(preference.getData_name(), preference.getLong_data());
                break;
            case 5:
                //boolean
                editor.putBoolean(preference.getData_name(), preference.getBoolean_data());
                break;
        }
        editor.apply();
        return editor.commit();
    }
    public boolean isSTrue(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getDeviceId()+database, MODE_PRIVATE);
        return sharedPreferences.getBoolean(name, false);
    }
    public int getSInt(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getDeviceId()+database, MODE_PRIVATE);
        return sharedPreferences.getInt(name, -1);
    }
    public String getSString(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getDeviceId()+database, MODE_PRIVATE);
        return sharedPreferences.getString(name, "m-n-f");
    }
    public float getSFloat(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getDeviceId()+database, MODE_PRIVATE);
        return sharedPreferences.getFloat(name, 0);
    }
    public long getSLong(String database,String name){
        sharedPreferences = context.
                getSharedPreferences(getDeviceId()+database, MODE_PRIVATE);
        return sharedPreferences.getLong(name, 0);
    }

}
