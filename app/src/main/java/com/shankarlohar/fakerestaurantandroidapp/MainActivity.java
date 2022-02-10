package com.shankarlohar.fakerestaurantandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterCardView, mainCardView, desertCardView;
    TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterCardView = findViewById(R.id.cardView_starters);
        mainCardView = findViewById(R.id.cardView_mainCourse);
        desertCardView = findViewById(R.id.cardView_desert);

        starterCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent starterActivityIntent = new Intent(MainActivity.this,StarterActivity.class);
                startActivity(starterActivityIntent);
            }
        });
        mainCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this,mainCourseActivity.class);
                startActivity(mainCoursesActivityIntent);
            }
        });

        desertCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this,DesertActivity.class);
                startActivity(mainCoursesActivityIntent);
            }
        });

        emailTextView = findViewById(R.id.email_text_view);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:fakerestaurant@shankarlohar.com"));
                startActivity(emailIntent);
            }
        });

    }
}