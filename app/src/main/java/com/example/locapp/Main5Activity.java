package com.example.locapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b1= findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Kwong Fuk Road",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt1Activity.class);
                startActivity(i);
            }});
        b2= findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Yurn Long Park",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt2Activity.class);
                startActivity(i);
            }});
        b3= findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Pat Heung Old Temple",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt3Activity.class);
                startActivity(i);
            }});
        b4= findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Kam Sheung Road Flea Market",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt4Activity.class);
                startActivity(i);
            }});
        b5= findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Nam Sang Wai",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt5Activity.class);
                startActivity(i);
            }});
        b6= findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Wetland Park",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt6Activity.class);
                startActivity(i);
            }});
        b7= findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to wikiwand",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt7Activity.class);
                startActivity(i);
            }});
        b8= findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Yik Butterfly Beach",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt8Activity.class);
                startActivity(i);
            }});
        b9= findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Anglers' Beach",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt9Activity.class);
                startActivity(i);
            }});
        b10= findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to The Mills",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt10Activity.class);
                startActivity(i);
            }});
        b11= findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Tsing Yi Bamboo Theatre",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt11Activity.class);
                startActivity(i);
            }});
        b12= findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Castle Peak Ba",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt12Activity.class);
                startActivity(i);
            }});
        b13= findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Hap Mun Bay",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt13Activity.class);
                startActivity(i);
            }});
        b14= findViewById(R.id.b14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main5Activity.this,"Welcome to Lo Wai",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Nt14Activity.class);
                startActivity(i);
            }});
    }
}
