package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class InplicitIntent extends AppCompatActivity {
    Button open_in_dialer, open_in_browser, sms_btn, email_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inplicit_intent);

        open_in_browser = findViewById(R.id.browser);
        open_in_dialer = findViewById(R.id.dialer);
        sms_btn = findViewById(R.id.sms);
        email_btn = findViewById(R.id.email);
        email_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "okeke@gmail.com";
                String subject = "We are learning android";

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, email);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                startActivity(intent);
            }
        });
        sms_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message  = "Hello world";
                String number  = "08106799951";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setType("vnd.android-dir/mms-sms");
                intent.putExtra("sms_body",message);
                intent.setData(Uri.parse("sms:"+number));
                startActivity(intent);



            }
        });
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