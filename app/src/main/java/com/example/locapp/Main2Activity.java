package com.example.locapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

private Button travel;
    private Button eat;
    private Button relax;
    private  Button web;
    private Button c;
    private Button land;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);

        travel= findViewById(R.id.travel);
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this,"Welcome to Hong Kong Island",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(i);
            }});
        eat = findViewById(R.id.eat);
       eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this,"Welcome to Kowloon",Toast.LENGTH_SHORT).show();
                Intent j = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(j);
            }});
        relax = findViewById(R.id.relax);
        relax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this,"Welcome to New Territories",Toast.LENGTH_SHORT).show();
                Intent k = new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(k);
            }});
        land = findViewById(R.id.land);
        land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this,"Enjoy",Toast.LENGTH_SHORT).show();
                Intent m = new Intent(getApplicationContext(),Main6Activity.class);
                startActivity(m);
            }});
        c = findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main2Activity.this,"Enjoy",Toast.LENGTH_SHORT).show();
                Intent m = new Intent(getApplicationContext(),CyanotypeActivity.class);
                startActivity(m);
            }});
        web = findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(Main2Activity.this,"Welcome to our website",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kinglaam3.wixsite.com/cyanotypehongkong"));
                    startActivity(intent);
                }});
    }}





















