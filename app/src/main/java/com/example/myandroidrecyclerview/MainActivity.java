package com.example.myandroidrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Animal> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.hasFixedSize();

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        initializeData();

    }

    // This method creates an ArrayList that has three Animal objects
    private void initializeData() {
        persons = new ArrayList<>();
        persons.add(new Animal("PEREGRINE FALCON", "200 mph", R.drawable.falcon));
        persons.add(new Animal("FRIGATE BIRD", "95 mph", R.drawable.frigate));
        persons.add(new Animal("SAIL FISH", "68 mph", R.drawable.sailfish));
        persons.add(new Animal("CHEETAH", "61 mph", R.drawable.cheetah));
        persons.add(new Animal("PRONGHORN ANTELOPE", "60 mph", R.drawable.antelope));
    }

}

