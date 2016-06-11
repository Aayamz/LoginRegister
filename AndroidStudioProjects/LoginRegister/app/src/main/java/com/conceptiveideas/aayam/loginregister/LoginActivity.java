package com.conceptiveideas.aayam.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText UsernameLog = (EditText) findViewById(R.id.edUsermnameLog);
        final EditText PasswordLog = (EditText) findViewById(R.id.edPasswordLog);
        final Button ResgisterHere = (Button) findViewById(R.id.bRegBtnLog);


    }

    public void RegisterHereClicked(View view){

        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);

    }
}
