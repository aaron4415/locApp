package com.example.locapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web5Activity extends AppCompatActivity {
    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web5);
        mWvMain = findViewById(R.id.wv);
        mWvMain.loadUrl("https://whereyourebetween.com/destinations/hong-kong/abandoned-gods-at-waterfall-bay-hong-kong/");
    }
}
