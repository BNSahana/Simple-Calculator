package com.example.myapplication10;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class flashscreen extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    private static  int SPLASH_TIME_OUT=1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashscreen);

        textView = (TextView) findViewById(R.id.tv_flashScreen_calculator);
        imageView = (ImageView) findViewById(R.id.iv_flashScreen_calcu_img);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(flashscreen.this, MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
