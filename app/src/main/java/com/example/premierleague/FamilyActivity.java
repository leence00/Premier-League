package com.example.premierleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.premierleague.databinding.ActivityNumberBinding;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {
    List<String> familyList;

    ActivityNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        familyList =new ArrayList<>();
        familyList.add("Milka");
        familyList.add("Joel");
        familyList.add("Martine");
        familyList.add("Okingo");
        familyList.add("Leence");
        familyList.add("Hillary");
        familyList.add("Kanyi");
        familyList.add("MAina");
        familyList.add("Wanga");
        familyList.add("Kiprono");
        familyList.add("Fred");
        familyList.add("Lidonde");




        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, familyList);
        binding.listView.setAdapter(adapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int Position, long id){
                Toast.makeText(getApplicationContext(), "You selected "+ familyList.get(Position), Toast.LENGTH_SHORT).show();
            }
        });

        binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FamilyActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        binding.main.setBackgroundColor(getResources().getColor(R.color.white));
    }
}