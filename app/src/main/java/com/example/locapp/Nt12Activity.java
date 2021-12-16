package com.example.locapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nt12Activity extends AppCompatActivity {
    private Button loc1;
    private Button view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nt12);
        loc1= findViewById(R.id.loc1);
        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("geo:0,0?q=青山灣海濱長廊");
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(uri);
                startActivity(i);

            }});
        view= findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://littlefatplanet.wordpress.com/2018/05/15/%E3%80%90%E9%9D%92%E5%B1%B1%E7%81%A3%E6%B5%B7%E6%BF%B1%E9%95%B7%E5%BB%8A%E3%80%91360%E5%85%A8%E6%B5%B7%E6%99%AFx%E8%B8%A9%E8%BB%8Ax%E6%94%BE%E7%8B%97x%E7%9D%87%E8%88%B9/"));
                startActivity(intent);

            }});
    }
}
