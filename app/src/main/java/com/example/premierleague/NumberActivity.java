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

public class NumberActivity extends AppCompatActivity {

    List<Word> numberList;

    ActivityNumberBinding binding;

    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        numberList =new ArrayList<>();
        numberList.add(new Word("one","moja",R.drawable.brother));
        numberList.add(new Word("two","mbili",R.drawable.child));
        numberList.add(new Word("three","tatu",R.drawable.father));
        numberList.add(new Word("four","nne",R.drawable.brother));
        numberList.add(new Word("five","tano",R.drawable.child));
        numberList.add(new Word("six","sita",R.drawable.father));
        numberList.add(new Word("seven","saba",R.drawable.brother));
        numberList.add(new Word("eight","name",R.drawable.child));
        numberList.add(new Word("nine","tisa",R.drawable.father));
        numberList.add(new Word("ten","kumi",R.drawable.brother));

        customAdapter= new CustomAdapter(this,numberList);
        binding.listView.setAdapter(customAdapter);








//
//        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, numberList);
//        binding.listView.setAdapter(adapter);
//        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?>parent, View view, int Position, long id){
//                Toast.makeText(getApplicationContext(), "You selected "+ numberList.get(Position), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        binding.main.setBackgroundColor(getResources().getColor(R.color.white));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}