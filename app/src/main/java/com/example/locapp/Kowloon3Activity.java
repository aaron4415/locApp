package com.example.locapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kowloon3Activity extends AppCompatActivity {
    private Button loc1;
    private Button view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kowloon3);
        loc1= findViewById(R.id.loc1);
        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("geo:0,0?q=街邊檔車仔麵, 104 Fuk Wing St, Un Chau");
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(uri);
                startActivity(i);

            }});
        view= findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.openrice.com/zh/hongkong/r-%E8%A1%97%E9%82%8A%E6%AA%94%E8%BB%8A%E4%BB%94%E9%BA%B5-%E6%B7%B1%E6%B0%B4%E5%9F%97-%E6%B8%AF%E5%BC%8F-%E8%BB%8A%E4%BB%94%E9%BA%B5-r638119"));
                startActivity(intent);

            }});
    }
}
