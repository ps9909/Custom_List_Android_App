package com.example.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter {
    Context context;
    Activity activity;
    String[] name;
    String[] age;
    int[] image;

    public MyAdapter(@NonNull Activity activity, String[] name, String[] age, int[] image) {
        super(activity, R.layout.item_layout, name);
        this.activity = activity;
        this.name = name;
        this.age = age;
        this.image = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_layout, null, true);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textName = view.findViewById(R.id.textView);
        TextView textAge = view.findViewById(R.id.textView2);

        imageView.setImageResource(image[position]);
        textName.setText(name[position]);
        textAge.setText(age[position]);


        return view;

    }
}
