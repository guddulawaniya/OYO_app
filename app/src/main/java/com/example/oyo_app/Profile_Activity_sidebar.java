package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.oyo_app.databinding.ActivityProfileSidebarBinding;

public class Profile_Activity_sidebar extends AppCompatActivity {

    ActivityProfileSidebarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileSidebarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}