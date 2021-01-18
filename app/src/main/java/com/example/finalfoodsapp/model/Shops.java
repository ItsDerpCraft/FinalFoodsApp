package com.example.finalfoodsapp.model;

public class Shops {
    Integer imageUrl;
    String name;
    String location;
    String phoneNumber;
    String distance;
    String workTime;

    public Shops(String name, String location, String phoneNumber, String distance, Integer imageUrl, String workTime) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.distance = distance;
        this.imageUrl = imageUrl;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDistance() {
        return distance;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public String getWorkTime() {
        return workTime;
    }
}
