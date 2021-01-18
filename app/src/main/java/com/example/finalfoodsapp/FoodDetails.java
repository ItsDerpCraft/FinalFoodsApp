package com.example.finalfoodsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalfoodsapp.adapter.AgainFoodAdapter;
import com.example.finalfoodsapp.adapter.ShopsAdapter;
import com.example.finalfoodsapp.model.AgainFood;
import com.example.finalfoodsapp.model.FavouriteFood;
import com.example.finalfoodsapp.model.Shops;

import java.util.ArrayList;
import java.util.List;

public class FoodDetails extends AppCompatActivity {
    ImageView imageView;
    TextView itemName, itemPrice, itemRating;
    String name, price, rating;
    Integer imageUrl;
    RecyclerView shopsRecycler;
    ShopsAdapter shopsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        price = intent.getStringExtra("price");
        rating = intent.getStringExtra("rating");
        imageUrl = intent.getIntExtra("image", 0);

        imageView = findViewById(R.id.detail_image);
        itemName = findViewById(R.id.name);
        itemPrice = findViewById(R.id.price);
        itemRating = findViewById(R.id.rating);

        imageView.setImageResource(imageUrl);
        itemRating.setText(rating);
        itemPrice.setText(price);
        itemName.setText(name);

        List<Shops> shopsList = new ArrayList<>();
        shopsList.add(new Shops("Dominoes Pizza","1826 Marine Dr", "(604) 984-3000", "1.7km", R.drawable.dominos,"12am"));
        setShopsRecycler(shopsList);


        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void setShopsRecycler(List<Shops> shopsList){
        shopsRecycler = findViewById(R.id.restaurantRecycler);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        shopsRecycler.setLayoutManager(layoutManager);
        shopsAdapter= new ShopsAdapter(this,shopsList);
        shopsRecycler.setAdapter(shopsAdapter);
    }

}