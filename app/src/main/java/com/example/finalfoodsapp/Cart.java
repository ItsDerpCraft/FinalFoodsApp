package com.example.finalfoodsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.finalfoodsapp.adapter.CartAdapter;
import com.example.finalfoodsapp.adapter.ShopsAdapter;
import com.example.finalfoodsapp.model.CartModel;
import com.example.finalfoodsapp.model.Shops;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AppCompatActivity {
    CartAdapter cartAdapter;
    RecyclerView cartRecycler;
    String name, price, amount;
    Integer imageUrl;
    TextView total;
    List<CartModel> cartModelList;

    SharedPreferences sharedPreferences;
    public static final String SHARED_PREFS = "sharedPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ImageButton backButton = (ImageButton) findViewById(R.id.close);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        Intent intent = getIntent();
        name = intent.getStringExtra("foodName");
        price = intent.getStringExtra("foodPrice");
        imageUrl = intent.getIntExtra("foodImageUrl", 0);
        amount = intent.getStringExtra("amount");
        total = findViewById(R.id.price);


        cartModelList = new ArrayList<>();
        cartModelList.add(new CartModel(name, price, amount, imageUrl));
        setCartRecycler(cartModelList);
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void setCartRecycler(List<CartModel> cartList){
        cartRecycler = findViewById(R.id.cartRecycler);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        cartRecycler.setLayoutManager(layoutManager);
        cartAdapter= new CartAdapter(this,cartList);
        cartRecycler.setAdapter(cartAdapter);
    }


}