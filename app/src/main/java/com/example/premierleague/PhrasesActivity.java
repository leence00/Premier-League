package com.example.premierleague;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.premierleague.databinding.ActivityNumberBinding;

public class PhrasesActivity extends AppCompatActivity {


        ActivityNumberBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding=ActivityNumberBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
        }

        @Override
        protected void onStart() {
            super.onStart();
            binding.main.setBackgroundColor(getResources().getColor(R.color.pink));
    }
}