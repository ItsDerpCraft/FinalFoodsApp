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

import com.example.finalfoodsapp.Cart;
import com.example.finalfoodsapp.FoodDetails;
import com.example.finalfoodsapp.R;
import com.example.finalfoodsapp.model.CartModel;
import com.example.finalfoodsapp.model.PopularFood;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    Context context;
    List<CartModel> cartList;

    public CartAdapter(Context context, List<CartModel> cartList) {
        this.context = context;
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cart_items, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        holder.itemImage.setImageResource(cartList.get(position).getImageUrl());
        holder.amount.setText(cartList.get(position).getAmount());
        holder.name.setText(cartList.get(position).getName());
        holder.price.setText(cartList.get(position).getPrice());



    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }


    public static final class CartViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView price, name, amount;


        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            price = itemView.findViewById(R.id.itemPrice);
            name = itemView.findViewById(R.id.itemName);
            amount = itemView.findViewById(R.id.amount);
        }
    }

}
