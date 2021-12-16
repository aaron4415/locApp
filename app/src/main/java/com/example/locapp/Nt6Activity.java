package com.example.locapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nt6Activity extends AppCompatActivity {
    private Button loc1;
    private Button view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nt6);
        loc1= findViewById(R.id.loc1);
        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("geo:0,0?q=濕地公園");
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(uri);
                startActivity(i);

            }});
        view= findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wetlandpark.gov.hk/en/aboutus/index"));
                startActivity(intent);

            }});
    }
}
