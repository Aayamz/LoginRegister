package com.conceptiveideas.aayam.login;


public class Config {
    //url to the Log in file..
    public static final String LOGIN_URL = "http://192.168.0.106/Android/Login.php";

    //keys for the Email and password as defined in the Login.php
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    //Set successful server response string
    public static final String LOGIN_SUCCESS = "success";

    //keys For shared preferences
    //name of app in shared pref...
    public static final String SHARED_PREF_NAME = "LoginApp";

    //storing the email of the current logged in user..
    public static final String EMAIL_SHARED_PREF = "email";

    //storing the boolean to check if the user is logged in or not..
    public static final String LOGGEDIN_SHARED_PREF = "loggedIn";
}
