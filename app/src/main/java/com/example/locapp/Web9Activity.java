package com.example.locapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web9Activity extends AppCompatActivity {
    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web9);
        mWvMain = findViewById(R.id.wv);
        mWvMain.loadUrl("http://www.discoverhongkong.com/eng/shop/where-to-shop/street-markets-and-shopping-streets/chun-yeung-street.jsp");
    }
}
