package com.example.locapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelComeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel_come);

        mHandler.sendEmptyMessageDelayed(GOTO_MAIN_ACTIVITY, 3000);//3秒跳轉

    }

    private static final int GOTO_MAIN_ACTIVITY = 0;

    private Handler mHandler = new Handler(){

        public void handleMessage(android.os.Message msg) {



            switch (msg.what) {

                case GOTO_MAIN_ACTIVITY:

                    Intent intent = new Intent();

                    intent.setClass(WelComeActivity.this, MainActivity.class);

                    startActivity(intent);

                    finish();

                    break;



                default:

                    break;

            }
    }
};}
