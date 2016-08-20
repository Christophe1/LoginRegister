package com.example.chris.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.chris.loginregister.R.id.bLogin;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
//        final Button bRegister = (Button) findViewById(bLogin);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomMsg);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        String message = username + "welcome to the App";
        welcomeMessage.setText(message);
        etUsername.setText(username);
    }
}
