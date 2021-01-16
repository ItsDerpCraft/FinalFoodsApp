package com.example.finalfoodsapp.model;

public class PopularFood {
    String name;
    String price;
    Integer imageUrl;

    public PopularFood(String name, String price, Integer imageUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }
}
