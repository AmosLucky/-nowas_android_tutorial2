package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    TextView fullNameET, usernameET, passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        fullNameET = findViewById(R.id.full_name);
        usernameET = findViewById(R.id.username);
        passwordET = findViewById(R.id.password);

        Bundle bundle = getIntent().getExtras();
        String full_name = bundle.getString("full_name");
        String username  =  bundle.getString("username");
        String password = bundle.getString("password");

        fullNameET.setText("FullName: "+ full_name);
        usernameET.setText("Username: "+username);
        passwordET.setText("Password: "+password);


    }
}