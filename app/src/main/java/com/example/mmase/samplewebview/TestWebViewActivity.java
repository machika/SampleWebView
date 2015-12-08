package com.example.mmase.samplewebview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class TestWebViewActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_web_view);
        WebView myWebView = (WebView)findViewById(R.id.mywebview);
        myWebView.loadUrl("http://www.yahoo.co.jp");

        findViewById(R.id.go_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText myEditText = (EditText)(findViewById(R.id.urlbar));
        String urlToGo = myEditText.getText().toString();
        WebView myWebView = (WebView)findViewById(R.id.mywebview);
        myWebView.loadUrl(urlToGo);
    }
}
