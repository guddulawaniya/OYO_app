package com.example.oyo_app;

import static com.example.oyo_app.R.anim.left_slide_animation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;



public class home_fragment extends Fragment {
    com.example.oyo_app.databinding.FragmentHomeFragmentBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = com.example.oyo_app.databinding.FragmentHomeFragmentBinding.inflate(inflater ,container , false);
        // Inflate the layout for this fragment



        binding.menuicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),Profile_Activity_sidebar.class);

                startActivity(intent);

            }
        });

        ArrayList<Models> list = new ArrayList<>();

        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mathura));

        gridelayoutAdapter adapter = new gridelayoutAdapter(list,getContext());


        binding.recommendedrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recommendedrecyclerview.setAdapter(adapter);


        return binding.getRoot();
    }
}