package com.shankarlohar.fakerestaurantandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DesertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        ListView mainCourseListView = findViewById(R.id.desert_list_view);

        DishClass[] dishes = {
                new DishClass("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
                new DishClass("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
                new DishClass("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 599),
                new DishClass("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
                new DishClass("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 499)
        };

        ArrayAdapter<DishClass> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);
        mainCourseListView.setAdapter(dishesAdapter);

    }
}