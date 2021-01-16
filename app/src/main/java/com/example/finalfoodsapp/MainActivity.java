package com.example.finalfoodsapp;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.finalfoodsapp.adapter.PopularFoodAdapter;
import com.example.finalfoodsapp.model.PopularFood;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("MeatZZa", "$21.99", R.drawable.pizza));
        popularFoodList.add(new PopularFood("MeatZZa", "$21.99", R.drawable.pizza));
        popularFoodList.add(new PopularFood("MeatZZa", "$21.99", R.drawable.pizza));

        setPopularRecycler(popularFoodList);
    }

    private void setPopularRecycler(List<PopularFood>popularFoodList){
        popularRecycler = findViewById(R.id.popular_food_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);
        popularFoodAdapter= new PopularFoodAdapter(this,popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }
}
