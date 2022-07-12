package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

import com.example.oyo_app.databinding.ActivityWebviewBinding;

public class webview_activity extends AppCompatActivity {

    ActivityWebviewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.webview.loadUrl("https://www.google.co.in/");
        binding.webview.getSettings().getJavaScriptEnabled();
        binding.webview.setWebViewClient(new WebViewClient());
    }
}