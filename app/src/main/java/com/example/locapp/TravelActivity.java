package com.example.locapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;

import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TravelActivity extends AppCompatActivity {
    private Button loc1;
    private Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_travel);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loc1= findViewById(R.id.loc1);
        loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("geo:0,0?q=鶴咀");
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(uri);
                startActivity(i);

            }});
       view= findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Web1Activity.class);
                startActivity(i);

            }});





}
  }
