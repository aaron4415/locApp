package com.example.locapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nt4Activity extends AppCompatActivity {
    private Button loc1;
    private Button view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nt4);
        loc1= findViewById(R.id.loc1);
        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("geo:0,0?q=錦上路跳蚤市場");
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(uri);
                startActivity(i);

            }});
        view= findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.guideguide.hk/%E3%80%90%E9%8C%A6%E7%94%B0%E4%B8%80%E6%97%A5%E9%81%8A%E3%80%91%E5%83%8F%E6%9F%90%E5%80%8B%E5%8F%B0%E7%81%A3%E5%B0%8F%E9%8E%AE-%E5%A4%A7%E8%A1%97%E7%95%AB%E6%BB%BF%E5%A3%81%E7%95%AB-%E7%99%BE/"));
                startActivity(intent);

            }});
    }
}
