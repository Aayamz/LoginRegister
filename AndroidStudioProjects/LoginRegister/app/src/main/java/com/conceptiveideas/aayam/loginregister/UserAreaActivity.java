package com.conceptiveideas.aayam.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText dUsername = (EditText) findViewById(R.id.etUsernameD);
        final EditText dAge = (EditText) findViewById(R.id.etAgeD);
        final TextView Welcome = (TextView) findViewById(R.id.tvWelcome);


    }
}
