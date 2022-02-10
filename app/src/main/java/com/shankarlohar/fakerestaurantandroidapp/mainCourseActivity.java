package com.shankarlohar.fakerestaurantandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);

        ListView mainCourseListView = findViewById(R.id.main_course_list_view);

        DishClass[] dishes = {
                new DishClass("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new DishClass("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
                new DishClass("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
                new DishClass("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
                new DishClass("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
                new DishClass("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
                new DishClass("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
                new DishClass("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)
        };

        ArrayAdapter<DishClass> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);
        mainCourseListView.setAdapter(dishesAdapter);

    }
}