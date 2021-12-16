package com.example.locapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1= findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main6Activity.this,"Welcome to Cheung Chau",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Is1Activity.class);
                startActivity(i);
            }});
        b2= findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Main6Activity.this,"Welcome to Tai O Stilt Houses",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Is2Activity.class);
                startActivity(i);
            }});
    }
}
