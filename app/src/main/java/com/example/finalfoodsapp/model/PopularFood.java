package com.example.finalfoodsapp.model;

public class PopularFood {
    String name;
    String price;
    String rating;
    Integer imageUrl;

    public PopularFood(String name, String price, String rating, Integer imageUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rating = rating;
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

    public String getRating() {
        return rating;
    }
}
