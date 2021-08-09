package com.gautam.krishna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seeking_Peace extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeking__peace);
        b1 = findViewById(R.id.but1);
        b2 = findViewById(R.id.but2);
        b3 = findViewById(R.id.but3);
        b4 = findViewById(R.id.but4);
        b5 = findViewById(R.id.but5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Seeking_Peace.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/2/66/");
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Seeking_Peace.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/2/71/");
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Seeking_Peace.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/4/39/");
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Seeking_Peace.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/5/29/");
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Seeking_Peace.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/8/28/");
                startActivity(i);
            }
        });

    }
}