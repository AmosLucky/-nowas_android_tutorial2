package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InplicitIntent extends AppCompatActivity {
    Button open_in_dialer, open_in_browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inplicit_intent);

        open_in_browser = findViewById(R.id.browser);
        open_in_dialer = findViewById(R.id.dialer);
        open_in_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(intent);
            }
        });

        open_in_dialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:08123456789"));
                startActivity(intent);

            }
        });


    }
}