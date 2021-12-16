package com.example.locapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web1Activity extends AppCompatActivity {
    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);
        mWvMain = findViewById(R.id.wv);
        mWvMain.loadUrl("https://www.getreadyhk.com/leisure-and-fun/hong-kong-outdoor-activity/outing-spot/item/1178-cape-d-aguilar");
    }
}
