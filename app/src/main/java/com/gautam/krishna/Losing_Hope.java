package com.gautam.krishna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Losing_Hope extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losing__hope);
        b1 = findViewById(R.id.but1);
        b2 = findViewById(R.id.but2);
        b3 = findViewById(R.id.but3);
        b4 = findViewById(R.id.but4);
        b5 = findViewById(R.id.but5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Losing_Hope.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/4/11/");
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Losing_Hope.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/9/22/");
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Losing_Hope.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/9/34/");
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Losing_Hope.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/18/66/");
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Losing_Hope.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/18/78/");
                startActivity(i);
            }
        });

    }
}