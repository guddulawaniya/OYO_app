package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.os.Bundle;
import android.view.View;

import com.example.oyo_app.databinding.ActivityDetailBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;

import java.util.ArrayList;


public class detail_Activity extends AppCompatActivity {

    int [] images = {R.drawable.roomimage1,R.drawable.roomimage2,R.drawable.roomimage3,R.drawable.roomimage4};


    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Models> offerlist =new ArrayList<>();
        offerlist.add(new Models(R.drawable.oyoimage));
        offerlist.add(new Models(R.drawable.oyoimage));
        offerlist.add(new Models(R.drawable.oyoimage));
        offerlist.add(new Models(R.drawable.oyoimage));
        offerlist.add(new Models(R.drawable.oyoimage));
        offerlist.add(new Models(R.drawable.oyoimage));
        offerlist.add(new Models(R.drawable.oyoimage));

        binding.bestofferforyouRecyclerview.setAdapter(new offerAdapter(offerlist,this));
        binding.bestofferforyouRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));


        detailproductsliderAdapter sliderAdapter = new detailproductsliderAdapter(images,this);
        binding.fullimagesliderdetail.setSliderAdapter(sliderAdapter);
        binding.fullimagesliderdetail.setIndicatorAnimation(IndicatorAnimationType.WORM);
        binding.fullimagesliderdetail.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        binding.detalbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}