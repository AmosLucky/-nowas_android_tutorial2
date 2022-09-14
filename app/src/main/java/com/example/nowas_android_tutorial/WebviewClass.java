package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewClass extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_class);
        webView = findViewById(R.id.webview);
        String url = "https://www.tiktok.com/en/";
        ProgressDialog progressDialog =  new ProgressDialog(this);
        progressDialog.setMessage("Loading....");
        progressDialog.setCancelable(true);

        webView.loadUrl(url);
        WebSettings webSettings =  webView.getSettings();
        webSettings.setSupportZoom(true);
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressDialog.show();
                if(url.startsWith("www.youtube.com")){
                    return;
                }
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressDialog.dismiss();
                super.onPageFinished(view, url);
            }
        });


    }
}