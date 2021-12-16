package com.example.locapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1= findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main4Activity.this,"Welcome to Garden Hill",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Kowloon1Activity.class);
                startActivity(i);
            }});
        b2= findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main4Activity.this,"Welcome to Golden Computer Arcade",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Kowloon2Activity.class);
                startActivity(i);
            }});
        b3= findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main4Activity.this,"Welcome to 深水埗車仔檔",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Kowloon3Activity.class);
                startActivity(i);
            }});
        b4= findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main4Activity.this,"Welcome to Kam Shan Country Park",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Kowloon4Activity.class);
                startActivity(i);
            }});
        b5= findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main4Activity.this,"Welcome to Shing Mun Reservoir",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Kowloon5Activity.class);
                startActivity(i);
            }});
        b6= findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main4Activity.this,"Welcome to Kwan Kee Store",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Kowloon6Activity.class);
                startActivity(i);
            }});
        b7= findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main4Activity.this,"Welcome to ChingChun Warehouse",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Kowloon7Activity.class);
                startActivity(i);
            }});

    }
}