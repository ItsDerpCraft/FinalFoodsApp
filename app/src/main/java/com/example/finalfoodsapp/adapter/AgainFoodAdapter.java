package com.example.finalfoodsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        holder.price.setText(againFoodList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return againFoodList.size();
    }


    public static final class AgainFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;


        public AgainFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
        }
    }

}
