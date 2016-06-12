package com.conceptiveideas.aayam.expertme;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    SharedPreferences Pref;
    SharedPreferences.Editor editor;
    Context _context;

    //shared Pref Mode
    int PRIVATE_MODE = 0;

    //shared pref File name
    private static final String PREF_NAME = "Expert Me - Welcome";
    private  static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context){
        this._context = context;
        Pref = _context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = Pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();
    }
    public boolean isFirstTimeLaunch(){
        return Pref.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }
}
