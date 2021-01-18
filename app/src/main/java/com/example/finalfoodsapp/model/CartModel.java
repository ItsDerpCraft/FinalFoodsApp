package com.example.finalfoodsapp.model;

public class CartModel {
    String name;
    String price;
    String amount;
    Integer imageUrl;

    public CartModel(String name, String price, String amount, Integer imageUrl) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getAmount() {
        return amount;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }
}
