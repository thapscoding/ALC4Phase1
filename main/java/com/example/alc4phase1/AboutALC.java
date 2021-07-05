// In order to successfully use the web view you need permission in the Android manifest file
package com.example.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    //Declare your variable
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        //Find view by ID Linked to XML
        myWebView = findViewById(R.id.load_alc_page);
        //Load the URL
        myWebView.loadUrl("https://andela.com/alc/");
        // call the setWebViewClient on myWebView
        // it will onReceivedSslError method
        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(final WebView view, final SslErrorHandler handler, final SslError error) {
                handler.proceed();
            }
        });
    }
}


