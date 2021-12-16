package com.example.locapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
private ImageView hk_1;
private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hk_1 = findViewById(R.id.hk_1);










login =  findViewById(R.id.btn_login);
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Toast.makeText(MainActivity.this,"Welcome!",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(MainActivity.this,Main2Activity.class);
            startActivity(intent);


   }
});



    }
}
