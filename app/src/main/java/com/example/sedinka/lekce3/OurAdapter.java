package com.example.sedinka.lekce3;

import android.app.Activity;
import android.support.v4.widget.ImageViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OurAdapter extends ArrayAdapter {
    private final ArrayList<Movie> movies;
    private final Activity activity;

    public OurAdapter(Activity activity, ArrayList<Movie> movies) {
        super(activity, R.layout.list_item, movies);
        this.activity = activity;
        this.movies = movies;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        TextView title = rowView.findViewById(R.id.title);
        TextView perc = rowView.findViewById(R.id.perc);
        TextView country= rowView.findViewById(R.id.country);
        TextView year = rowView.findViewById(R.id.year);
        ImageView image = rowView.findViewById(R.id.image);

        title.setText(movies.get(position).title);
        perc.setText(movies.get(position).perc);
        country.setText(movies.get(position).country);
        year.setText(movies.get(position).year);
        image.setImageResource(movies.get(position).image);

        return rowView;
    }

}
