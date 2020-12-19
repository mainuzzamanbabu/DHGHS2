package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class RegisterForProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_for_program);
        WebView gView;
        gView = findViewById(R.id.webview);
        //   gView2 = findViewById(R.id.webview2);

        gView.loadUrl("https://bit.ly/2rxPszP");
        // gView2.loadUrl("https://bit.ly/2OREHQI");
        WebSettings webSettings = gView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}
