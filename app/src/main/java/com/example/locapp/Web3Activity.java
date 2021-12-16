package com.example.locapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web3Activity extends AppCompatActivity {
    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);
        mWvMain = findViewById(R.id.wv);
        mWvMain.loadUrl("https://www.cyberport.hk/zh_tw/about_cyberport/about_overview");
    }
}
