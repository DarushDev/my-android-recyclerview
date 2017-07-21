package com.example.myandroidrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        //recyclerView.hasFixedSize();

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        initializeData();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(animals);
        recyclerView.setAdapter(adapter);

    }

    // This method creates an ArrayList that has three Animal objects
    private void initializeData() {
        animals = new ArrayList<>();
        animals.add(new Animal("Peregrine Falcon", "200 mph", R.drawable.falcon));
        animals.add(new Animal("Frigate Bird", "95 mph", R.drawable.frigate));
        animals.add(new Animal("Sail Fish", "68 mph", R.drawable.sailfish));
        animals.add(new Animal("Cheetah", "61 mph", R.drawable.cheetah));
        animals.add(new Animal("Pronghorn Antelope", "60 mph", R.drawable.antelope));
    }

}

