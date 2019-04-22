package com.example.sedinka.lekce3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public ArrayList<Movie> movies;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Movie movie = getIntent().getParcelableExtra("data");
        ImageView image = findViewById(R.id.image);
        Glide.with(this).load(movie.image).into(image);
        setTitle(movie.title);

        TextView type = findViewById(R.id.type);
        TextView rating = findViewById(R.id.rating);
        TextView description = findViewById(R.id.description);

        type.setText(movie.title);
        description.setText(movie.description);
    }
}
