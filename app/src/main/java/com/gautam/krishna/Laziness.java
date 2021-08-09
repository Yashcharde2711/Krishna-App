package com.gautam.krishna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Laziness extends AppCompatActivity {
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laziness);
        b1 = findViewById(R.id.but1);
        b2 = findViewById(R.id.but2);
        b3 = findViewById(R.id.but3);
        b4 = findViewById(R.id.but4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Laziness.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/3/8/");
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Laziness.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/3/20/");
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Laziness.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/6/16/");
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Laziness.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/18/39/");
                startActivity(i);
            }
        });

    }
}