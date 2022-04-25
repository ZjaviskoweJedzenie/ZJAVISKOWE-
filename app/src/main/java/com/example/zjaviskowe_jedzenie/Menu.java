package com.example.zjaviskowe_jedzenie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

import com.example.zjaviskowe_jedzenie.Adaptery.Adapter;
import com.example.zjaviskowe_jedzenie.databinding.ActivityMenuBinding;

public class Menu extends AppCompatActivity {

    private ActivityMenuBinding binding;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initAdapter();
    }

    private void initAdapter() {
        adapter = new Adapter();

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        binding.food.setLayoutManager(layoutManager);

        binding.food.setAdapter(adapter);

    }

}