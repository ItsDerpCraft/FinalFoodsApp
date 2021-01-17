package com.example.finalfoodsapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalfoodsapp.FoodDetails;
import com.example.finalfoodsapp.R;
import com.example.finalfoodsapp.model.FavouriteFood;

import java.util.List;

public class FavouriteFoodAdapter extends RecyclerView.Adapter<FavouriteFoodAdapter.FavouriteFoodViewHolder> {

    Context context;
    List<FavouriteFood> favouriteFoodList;

    public FavouriteFoodAdapter(Context context, List<FavouriteFood> favouriteFoodList) {
        this.context = context;
        this.favouriteFoodList = favouriteFoodList;
    }

    @NonNull
    @Override
    public FavouriteFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.favourite_food, parent, false);
        return new FavouriteFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavouriteFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(favouriteFoodList.get(position).getImageUrl());
        holder.name.setText(favouriteFoodList.get(position).getName());
        holder.price.setText(favouriteFoodList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, FoodDetails.class);
                i.putExtra("name", favouriteFoodList.get(position).getName());
                i.putExtra("price", favouriteFoodList.get(position).getPrice());
                i.putExtra("rating", favouriteFoodList.get(position).getRating());
                i.putExtra("image", favouriteFoodList.get(position).getImageUrl());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return favouriteFoodList.size();
    }


    public static final class FavouriteFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;


        public FavouriteFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
        }
    }

}
