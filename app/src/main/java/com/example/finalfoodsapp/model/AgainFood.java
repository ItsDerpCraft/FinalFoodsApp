package com.example.finalfoodsapp.model;

public class AgainFood {
    String name;
    String price;
    String rating;
    Integer imageUrl;

    public AgainFood(String name, String price, String rating, Integer imageUrl) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    public String getName() { return name; }

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
