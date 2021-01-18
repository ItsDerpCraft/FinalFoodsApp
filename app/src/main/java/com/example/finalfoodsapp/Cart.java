package com.example.finalfoodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Cart extends AppCompatActivity {
    String name, price, distance;
    Integer imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Intent intent = getIntent();
        distance = intent.getStringExtra("shopDistance");
        name = intent.getStringExtra("foodName");
        price = intent.getStringExtra("foodPrice");
        imageUrl = intent.getIntExtra("foodImageUrl", 0);


    }

}