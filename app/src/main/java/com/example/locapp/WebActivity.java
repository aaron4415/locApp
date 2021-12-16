package com.example.locapp;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_web);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mWvMain = findViewById(R.id.wv);
        mWvMain.setWebViewClient(new WebViewClient());
       mWvMain.loadUrl("https://kinglaam3.wixsite.com/cyanotypehongkong");




    }

}
