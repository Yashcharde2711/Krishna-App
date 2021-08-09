package com.gautam.krishna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Feeling_Sinful extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling__sinful);
        b1 = findViewById(R.id.but1);
        b2 = findViewById(R.id.but2);
        b3 = findViewById(R.id.but3);
        b4 = findViewById(R.id.but4);
        b5 = findViewById(R.id.but5);
        b6 = findViewById(R.id.but6);
        b7 = findViewById(R.id.but7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Feeling_Sinful.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/4/36/");
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Feeling_Sinful.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/4/37/");
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Feeling_Sinful.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/5/10/");
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Feeling_Sinful.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/9/30/");
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Feeling_Sinful.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/10/3/");
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Feeling_Sinful.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/14/6/");
                startActivity(i);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Feeling_Sinful.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/18/66/");
                startActivity(i);

            }
        });

    }
}