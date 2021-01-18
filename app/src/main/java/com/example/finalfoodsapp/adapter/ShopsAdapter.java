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
import com.example.finalfoodsapp.model.Shops;

import java.util.List;

public class ShopsAdapter extends RecyclerView.Adapter<ShopsAdapter.ShopsViewHolder> {

    Context context;
    List<Shops> shopsList;


    public ShopsAdapter(Context context, List<Shops> shopsList) {
        this.context = context;
        this.shopsList = shopsList;
    }

    @NonNull
    @Override
    public ShopsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.shops, parent, false);
        return new ShopsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopsViewHolder holder, int position) {
        holder.shopImage.setImageResource(shopsList.get(position).getImageUrl());
        holder.name.setText(shopsList.get(position).getName());
        holder.distance.setText(shopsList.get(position).getDistance());
        holder.location.setText(shopsList.get(position).getLocation());
        holder.phoneNumber.setText(shopsList.get(position).getPhoneNumber());
        holder.workTime.setText(shopsList.get(position).getWorkTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, FoodDetails.class);
                i.putExtra("shopDistance", shopsList.get(position).getDistance());
                i.putExtra("foodName", R.id.detail_name);
                i.putExtra("foodImageUrl", R.id.detail_image);
                i.putExtra("foodPrice", R.id.detail_price);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return shopsList.size();
    }


    public static final class ShopsViewHolder extends RecyclerView.ViewHolder{

        ImageView shopImage;
        TextView location, phoneNumber, distance, name, workTime;


        public ShopsViewHolder(@NonNull View itemView) {
            super(itemView);
            shopImage = itemView.findViewById(R.id.shopImage);
            location = itemView.findViewById(R.id.shopLocation);
            name = itemView.findViewById(R.id.shopName);
            distance = itemView.findViewById(R.id.shopDistance);
            phoneNumber = itemView.findViewById(R.id.phoneNumber);
            workTime = itemView.findViewById(R.id.workTime);
        }
    }

}
