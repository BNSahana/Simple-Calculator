package com.example.myapplication10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class first_pg extends AppCompatActivity {
    TextView textView;
    Button button,button1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_pg);

        textView=(TextView)findViewById(R.id.tv_first_pg_Welcome);
        button=(Button)findViewById(R.id.btn_first_pg_MyApp);
        button1=(Button)findViewById(R.id.btn_first_pg_MyProfile);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appIntent=new Intent(first_pg.this,flashscreen.class);
                startActivity(appIntent);
                finish();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ProfileIntent=new Intent(first_pg.this,web.class);
                startActivity(ProfileIntent);
                finish();
            }
        });

    }
}
