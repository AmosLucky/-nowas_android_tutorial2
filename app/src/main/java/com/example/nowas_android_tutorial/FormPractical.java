package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormPractical extends AppCompatActivity {
    EditText fullNameEd, usernameEd,passwordEd;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_practical);
        fullNameEd = findViewById(R.id.full_name);
        usernameEd = findViewById(R.id.username);
        passwordEd = findViewById(R.id.password);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullNameText =  fullNameEd.getText().toString();
                String usernameText =  usernameEd.getText().toString();
                String passwordText =  passwordEd.getText().toString();

                if(fullNameText.trim().length() < 3){
                    fullNameEd.setError("Full name too short");
                    return;
                }
                if(usernameText.trim().length() < 2){
                    usernameEd.setError("Username too short");
                    return;

                }
                if(passwordText.trim().length() < 6){
                    passwordEd.setError("password must be greater 6 characters");
                    return;

                }

                /////////////EVREYTHING IS GOOD////////
                Bundle bundle = new Bundle();
                bundle.putString("full_name",fullNameText);
                bundle.putString("username",usernameText);
                bundle.putString("password",passwordText);

                Intent intent = new Intent(FormPractical.this, Dashboard.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}