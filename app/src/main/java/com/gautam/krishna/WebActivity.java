package com.gautam.krishna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {
    WebView w2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        w2 = findViewById(R.id.web1);
        String ulr=getIntent().getStringExtra("url");
        w2.loadUrl(ulr);
    }
}