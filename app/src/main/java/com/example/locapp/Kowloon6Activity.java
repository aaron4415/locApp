package com.example.locapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kowloon6Activity extends AppCompatActivity {
    private Button loc1;
    private Button view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kowloon6);
        loc1= findViewById(R.id.loc1);
        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("geo:0,0?q=坤記糕品 ho building b2 Pei, 115-117 Fuk Wa St, Sham Shui Po");
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(uri);
                startActivity(i);

            }});
        view= findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.openrice.com/zh/hongkong/r-%E5%9D%A4%E8%A8%98%E7%B3%95%E5%93%81%E5%B0%88%E5%AE%B6-%E6%B7%B1%E6%B0%B4%E5%9F%97-%E7%B2%B5%E8%8F%9C-%E5%BB%A3%E6%9D%B1-%E7%94%9C%E5%93%81-%E7%B3%96%E6%B0%B4-r10918"));
                startActivity(intent);

            }});
    }
}
