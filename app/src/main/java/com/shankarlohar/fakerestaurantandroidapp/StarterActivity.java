package com.shankarlohar.fakerestaurantandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView startersList = findViewById(R.id.starters_list_view);

        DishClass[] dishes = {
                new DishClass("Mushroom and tofu maki","Toasted seaweed wrapped around shushi rice, filled with chestnut mushroom and smoked tofu",999),
                new DishClass("Egg and avocado uramaki","Pasta in a sauce made from free range eggs and fresh avocado",1199),
                new DishClass("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new DishClass("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new DishClass("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new DishClass("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new DishClass("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new DishClass("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new DishClass("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new DishClass("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };


        ArrayAdapter<DishClass> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}