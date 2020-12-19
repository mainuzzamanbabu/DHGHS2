package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AdminRegisterStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_register_student);
        WebView gView;
        gView = findViewById(R.id.webview);


        gView.loadUrl("https://bit.ly/2s4FIO6");

        WebSettings webSettings = gView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
