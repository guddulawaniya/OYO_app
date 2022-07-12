package com.example.oyo_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.oyo_app.databinding.FragmentHelpBinding;

public class help_Fragment extends Fragment {

    FragmentHelpBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHelpBinding.inflate(inflater, container,false);
        binding.helpwebview.loadUrl("https://www.google.co.in/");
        binding.helpwebview.getSettings().getJavaScriptEnabled();
        binding.helpwebview.setWebViewClient(new WebViewClient());
        // Inflate the layout for this fragment

        return binding.getRoot();
    }
}