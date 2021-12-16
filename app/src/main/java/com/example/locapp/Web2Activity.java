package com.example.locapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web2Activity extends AppCompatActivity {
    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        mWvMain = findViewById(R.id.wv);
        mWvMain.loadUrl("https://zh.m.wikipedia.org/zh-hk/赤柱卜公碼頭");
    }
}
