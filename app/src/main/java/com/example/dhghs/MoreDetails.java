package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MoreDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);
        setTitle("Know More About DHGHS Golden Jubilee-2020");
        WebView gView;
        gView = findViewById(R.id.webview);
        //   gView2 = findViewById(R.id.webview2);

        gView.loadUrl("https://wwww.sites.google.com/view/dhghs");
        // gView2.loadUrl("https://bit.ly/2OREHQI");
        WebSettings webSettings = gView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
