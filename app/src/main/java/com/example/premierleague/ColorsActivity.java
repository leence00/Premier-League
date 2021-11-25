package com.example.premierleague;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.premierleague.databinding.ActivityNumberBinding;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    List<String> colorsList;

    ActivityNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        colorsList =new ArrayList<>();
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Red");
        colorsList.add("Orange");
        colorsList.add("Pink");
        colorsList.add("Yellow");
        colorsList.add("Royal blue");
        colorsList.add("Black");
        colorsList.add("Gray");
        colorsList.add("Maroon");
        colorsList.add("Purple");
        colorsList.add("Cream");
        colorsList.add("Royal blue");
        colorsList.add("Black");
        colorsList.add("Gray");
        colorsList.add("Maroon");
        colorsList.add("Purple");
        colorsList.add("Cream");



        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, colorsList);
        binding.listView.setAdapter(adapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int Position, long id){
                Toast.makeText(getApplicationContext(), "You selected "+ colorsList.get(Position), Toast.LENGTH_SHORT).show();
            }
        });
    }

        @Override
        protected void onStart() {
            super.onStart();
            binding.main.setBackgroundColor(getResources().getColor(R.color.white));
    }
}