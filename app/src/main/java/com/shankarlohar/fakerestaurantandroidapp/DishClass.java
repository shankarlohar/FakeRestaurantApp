package com.shankarlohar.fakerestaurantandroidapp;

public class DishClass {

    String title;
    String description;
    int price;
    public DishClass(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
