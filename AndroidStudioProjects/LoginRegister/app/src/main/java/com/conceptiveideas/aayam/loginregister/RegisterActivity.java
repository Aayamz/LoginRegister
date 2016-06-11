package com.conceptiveideas.aayam.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText edAge = (EditText) findViewById(R.id.edAge);
        final EditText edName = (EditText) findViewById(R.id.edName);
        final EditText edUsername = (EditText) findViewById(R.id.edUsername);
        final EditText edPassword = (EditText) findViewById(R.id.edPassword);
        final Button bRegBtn = (Button) findViewById(R.id.bRegBtn);

       bRegBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

    }

}
