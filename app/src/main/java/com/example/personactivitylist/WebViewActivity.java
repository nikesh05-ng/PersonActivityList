package com.example.personactivitylist;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        //wire
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new demo1TrySpecificUrl());

        //get the pushed data
        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String url = bundle.getString("url");
        demo1TrySpecificUrl(url);
    }


    private void demo1TrySpecificUrl(String url) {
        webView.getSettings().getJavaScriptEnabled();
        //webView.setWebViewClient();
        webView.loadUrl(url);
    }
}
