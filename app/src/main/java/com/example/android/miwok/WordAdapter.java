package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by noushad on 2/15/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int color;

    public WordAdapter(AppCompatActivity appCompatActivity, ArrayList<Word> words, int color) {
        super(appCompatActivity, 0, words);
        this.color = ContextCompat.getColor(getContext(), color);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);


        TextView miwoktextView = (TextView) listItemView.findViewById(R.id.miwokTextView);

        miwoktextView.setText(currentWord.getMiwokTranslation());

        TextView englistextView = (TextView) listItemView.findViewById(R.id.englishTextView);
        englistextView.setText(currentWord.getDefaultTranslation());

        //need a image view later.
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());

            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }
        LinearLayout wordsView = (LinearLayout) listItemView.findViewById(R.id.wordsView);
        wordsView.setBackgroundColor(color);


        return listItemView;

    }





}
