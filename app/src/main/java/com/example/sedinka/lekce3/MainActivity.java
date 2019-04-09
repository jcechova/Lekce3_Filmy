package com.example.sedinka.lekce3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = new ArrayList<>();
        movies.add(new Movie(R.drawable.vykoupeni, "Vykoupení z věznice Shawshank", "95%", "USA","1994"));
        movies.add(new Movie(R.drawable.nedotknutelni, "Nedotknutelní", "91%", "Francie","2011"));
        movies.add(new Movie(R.drawable.prach, "Hvězdný prach", "84%", "VB/USA/Island","2007"));
        movies.add(new Movie(R.drawable.bohemian, "Bohemian Rhapsody", "90%", "USA","2018"));
        movies.add(new Movie(R.drawable.pelisky, "Pelíšky", "91%", "ČR","1999"));
        movies.add(new Movie(R.drawable.laska, "Láska Nebeská", "86%", "USA/Francie/VB","2003"));
        movies.add(new Movie(R.drawable.pulp, "Pulp Fiction: Historky z podsvětí", "91%", "USA","1994"));
        movies.add(new Movie(R.drawable.amy, "Amy", "81%", "VB","2015"));
        movies.add(new Movie(R.drawable.amelie, "Amélie z Montmartru", "85%", "Francie/Německo","2001"));
        movies.add(new Movie(R.drawable.lekce, "Lekce neslušného chování", "78%", "VB/Kanada","2008"));


        OurAdapter adapter = new OurAdapter(this, movies);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, movies.get(position).title,
                Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("data",movies.get(position));
                MainActivity.this.startActivity(intent);
            }

        });
    }
}
