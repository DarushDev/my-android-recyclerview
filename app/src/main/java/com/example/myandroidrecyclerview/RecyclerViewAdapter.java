package com.example.myandroidrecyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.AnimalViewHolder> {

    List<Animal> animals;

    public RecyclerViewAdapter(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new AnimalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {

        holder.animalName.setText(animals.get(position).name);
        holder.animalSpeed.setText(animals.get(position).speed);
        holder.animalPhoto.setImageResource(animals.get(position).photoId);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    class AnimalViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView animalName;
        TextView animalSpeed;
        ImageView animalPhoto;

        AnimalViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cv);
            animalName = itemView.findViewById(R.id.person_name);
            animalSpeed = itemView.findViewById(R.id.person_age);
            animalPhoto = itemView.findViewById(R.id.person_photo);
        }

    }

}

