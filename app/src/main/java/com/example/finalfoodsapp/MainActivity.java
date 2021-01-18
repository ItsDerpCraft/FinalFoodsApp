package com.example.finalfoodsapp;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalfoodsapp.adapter.AgainFoodAdapter;
import com.example.finalfoodsapp.adapter.FavouriteFoodAdapter;
import com.example.finalfoodsapp.adapter.PopularFoodAdapter;
import com.example.finalfoodsapp.model.AgainFood;
import com.example.finalfoodsapp.model.FavouriteFood;
import com.example.finalfoodsapp.model.PopularFood;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;
    RecyclerView favouriteRecycler;
    FavouriteFoodAdapter favouriteFoodAdapter;
    RecyclerView againRecycler;
    AgainFoodAdapter againFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("MeatZZa", "$21.99", "4.5", R.drawable.pizza));
        setPopularRecycler(popularFoodList);

        List<FavouriteFood> favouriteFoodList = new ArrayList<>();


        setFavouriteRecycler(favouriteFoodList);

        List<AgainFood> againFoodList = new ArrayList<>();
        againFoodList.add(new AgainFood("MeatZZa", "$21.99", "4.5", R.drawable.pizza));
        setAgainRecycler(againFoodList);
    }

    private void setPopularRecycler(List<PopularFood>popularFoodList){
        popularRecycler = findViewById(R.id.popular_food_recycler);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter= new PopularFoodAdapter(this,popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setFavouriteRecycler(List<FavouriteFood>favouriteFoodList){
        favouriteRecycler = findViewById(R.id.favourite_food_recycler);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);
        favouriteRecycler.setLayoutManager(layoutManager);
        favouriteFoodAdapter= new FavouriteFoodAdapter(this,favouriteFoodList);
        favouriteRecycler.setAdapter(favouriteFoodAdapter);
    }

    private void setAgainRecycler(List<AgainFood>againFoodList){
        againRecycler = findViewById(R.id.again_food_recycler);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        againRecycler.setLayoutManager(layoutManager);
        againFoodAdapter= new AgainFoodAdapter(this,againFoodList);
        againRecycler.setAdapter(againFoodAdapter);
    }
}
