package com.nkcdev.infobook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {

    private ArrayList<ModelClass> modelList;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    //As soon as CardViewHolder is created the method is called
    //In this method we define card design that we've made
    //Thanks to this method we define which design will be displayed in the Recycler View
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Transfer card design to the object
        //Linking design to the view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);

        return new CardViewHolder(view);
    }

    //Here we define what should be done when the design that we created is connected to the in Recycler View
    //We will show data
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        ModelClass model = modelList.get(position);
        holder.textViewSplash.setText(model.getCategoryName());
        holder.imageViewSplash.setImageResource(context.getResources()
                .getIdentifier(model.getImageName(), "drawable", context.getPackageName()));

        holder.cardView.setOnClickListener(view -> {

            if (holder.getAdapterPosition() == 0) {
                Intent intent = new Intent(context, CountriesActivity.class);
                context.startActivity(intent);
            }
            if (holder.getAdapterPosition() == 1) {
                Intent intent = new Intent(context, LeadersActivity.class);
                context.startActivity(intent);
            }
            if (holder.getAdapterPosition() == 2) {
                Intent intent = new Intent(context, MuseumsActivity.class);
                context.startActivity(intent);
            }
            if (holder.getAdapterPosition() == 3) {
                Intent intent = new Intent(context, WondersActivity.class);
                context.startActivity(intent);
            }

        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }
}
