package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SeeRegisteredStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_registered_student);
        WebView gView;
        gView = findViewById(R.id.webview);
        gView.loadUrl("https://bit.ly/34QN2dn");
        WebSettings webSettings = gView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
//http://bit.ly/34QN2dn