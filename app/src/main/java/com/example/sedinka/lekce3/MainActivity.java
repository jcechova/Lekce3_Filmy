package com.example.sedinka.lekce3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.bear, "Bear", "bla bla"));
        animals.add(new Animal(R.drawable.alligator, "Aligator", "bla bla"));
        animals.add(new Animal(R.drawable.bee, "Bee", "bla bla"));
        animals.add(new Animal(R.drawable.dolphin, "Dolfin", "bla bla"));
        animals.add(new Animal(R.drawable.horse, "Horse", "bla bla"));
        animals.add(new Animal(R.drawable.pig, "Pig", "bla bla"));
        animals.add(new Animal(R.drawable.snail, "Snail", "bla bla"));
        animals.add(new Animal(R.drawable.parrot, "Parot", "bla bla"));

        OurAdapter adapter = new OurAdapter(this, animals);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
