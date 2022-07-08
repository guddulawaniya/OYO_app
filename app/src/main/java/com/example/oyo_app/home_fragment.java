package com.example.oyo_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oyo_app.databinding.FragmentHomeFragmentBinding;

import java.util.ArrayList;

public class home_fragment extends Fragment {
    FragmentHomeFragmentBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeFragmentBinding.inflate(inflater ,container , false);
        // Inflate the layout for this fragment


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