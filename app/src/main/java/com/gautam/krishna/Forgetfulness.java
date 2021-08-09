package com.gautam.krishna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Forgetfulness extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetfulness);
        b1 = findViewById(R.id.but1);
        b2 = findViewById(R.id.but2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Forgetfulness.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/15/15/");
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Forgetfulness.this,WebActivity.class);
                i.putExtra("url","https://vedabase.io/en/library/bg/18/61/");
                startActivity(i);

            }
        });


    }
}