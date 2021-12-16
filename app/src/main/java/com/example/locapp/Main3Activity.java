package com.example.locapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main3);
        b1= findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Cape D'Aguilar",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),TravelActivity.class);
                startActivity(i);
            }});
        b2= findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Stanley Blake Pier",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel1Activity.class);
                startActivity(i);
            }});
        b3= findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Cyberport",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel2Activity.class);
                startActivity(i);
            }});
        b4= findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Wah Fu Estate",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel3Activity.class);
                startActivity(i);
            }});
        b5= findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Waterfall Bay",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel4Activity.class);
                startActivity(i);
            }});
        b6= findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to TaiKwun",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel5Activity.class);
                startActivity(i);
            }});
        b7= findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Sunbeam Theatre",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel6Activity.class);
                startActivity(i);
            }});
        b8= findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Yik Cheong Building",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel7Activity.class);
                startActivity(i);
            }});
        b9= findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main3Activity.this,"Welcome to Chun Yeung Street",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Travel8Activity.class);
                startActivity(i);
            }});
    }
}
