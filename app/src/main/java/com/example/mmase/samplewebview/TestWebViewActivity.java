package com.example.mmase.samplewebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TestWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_web_view);
        WebView myWebView = (WebView)findViewById(R.id.mywebview);
        myWebView.loadUrl("http://www.yahoo.co.jp");
    }
}
