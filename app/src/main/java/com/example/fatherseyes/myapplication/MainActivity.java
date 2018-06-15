package com.example.fatherseyes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String url="https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/";
        WebView view= this.findViewById(R.id.webview1);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
