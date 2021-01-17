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
import com.example.finalfoodsapp.model.AgainFood;

import java.util.List;

public class AgainFoodAdapter extends RecyclerView.Adapter<AgainFoodAdapter.AgainFoodViewHolder> {

    Context context;
    List<AgainFood> againFoodList;

    public AgainFoodAdapter(Context context, List<AgainFood> againFoodList) {
        this.context = context;
        this.againFoodList = againFoodList;
    }

    @NonNull
    @Override
    public AgainFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.again_food, parent, false);
        return new AgainFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AgainFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(againFoodList.get(position).getImageUrl());
        holder.name.setText(againFoodList.get(position).getName());
        holder.rating.setText(againFoodList.get(position).getRating());
        holder.price.setText(againFoodList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, FoodDetails.class);
                i.putExtra("name", againFoodList.get(position).getName());
                i.putExtra("price", againFoodList.get(position).getPrice());
                i.putExtra("rating", againFoodList.get(position).getRating());
                i.putExtra("image", againFoodList.get(position).getImageUrl());

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return againFoodList.size();
    }


    public static final class AgainFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name, rating;


        public AgainFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
        }
    }

}
