package com.example.premierleague;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<Word> wordList;

    public CustomAdapter(Context context, List<Word> wordList) {
        this.context = context;
        this.wordList = wordList;
    }

    @Override
    public int getCount() {

        return wordList.size();
    }

    @Override
    public Object getItem(int i) {
        return wordList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.list_item, null);

        TextView english = (TextView) view.findViewById(R.id.textViewEng);
        TextView kiswahili = view.findViewById(R.id.textViewKisw);
        ImageView imageView = view.findViewById(R.id.imageView);

        imageView.setImageResource(wordList.get(i).getImage());
        english.setText(wordList.get(i).getEnglishWord());
        kiswahili.setText(wordList.get(i).getKiswahiliWord());

        return view;
    }
}


