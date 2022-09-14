package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button introduction;
    Button designclass;
    Button designclass2,form,form_practical,listview,intent, webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        introduction = findViewById(R.id.introduction);
        designclass = findViewById(R.id.designclass);
        designclass2 = findViewById(R.id.designclass2);
        form = findViewById(R.id.form);
        form_practical = findViewById(R.id.form_practical);
        listview = findViewById(R.id.listview);
        intent = findViewById(R.id.intent);
        webview = findViewById(R.id.webview);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebviewClass.class);
                startActivity(intent);

            }
        });

        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, InplicitIntent.class);
                startActivity(intent);

            }
        });

        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ListViewPractal.class);
                startActivity(intent);

            }
        });
        form_practical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FormPractical.class);
                startActivity(intent);

            }
        });

        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FormActivty.class);
                startActivity(intent);

            }
        });

        designclass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Design2.class);
                startActivity(intent);

            }
        });

        designclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, DesignClass.class);
                startActivity(intent);

            }
        });

        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ///Navigate//
                Intent intent = new Intent(MainActivity.this, Introdcution.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}