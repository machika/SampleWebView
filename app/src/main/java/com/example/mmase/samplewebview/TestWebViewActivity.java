package com.example.mmase.samplewebview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TestWebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_web_view);
        WebView myWebView = (WebView)findViewById(R.id.mywebview);
        myWebView.loadUrl("http://www.yahoo.co.jp");
    }
}
