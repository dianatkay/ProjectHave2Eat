package com.example.projecthave2eat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView tipCalculator,restaurants,calendar,
            reservations,comments,calories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining Cards
        tipCalculator = (CardView)findViewById(R.id.tipCalculator);
        restaurants = (CardView)findViewById(R.id.restaurants);
        reservations = (CardView)findViewById(R.id.reservations);
        calendar = (CardView)findViewById(R.id.calender);
        comments = (CardView)findViewById(R.id.comments);
        calories = (CardView)findViewById(R.id.calories);

        //adding click listener
        tipCalculator.setOnClickListener(this);
        reservations.setOnClickListener(this);
        restaurants.setOnClickListener(this);
        calendar.setOnClickListener(this);
        comments.setOnClickListener(this);
        calories.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
           case R.id.tipCalculator: i= new Intent(this,TipCalculator.class);startActivity(i);break;
           case R.id.reservations: i= new Intent(this,Reservations.class);startActivity(i);break;
           case R.id.restaurants: i= new Intent(this,Restaurants.class);startActivity(i);break;
           case R.id.calender: i= new Intent(this,Calender.class);startActivity(i);break;
           case R.id.comments: i= new Intent(this,Comments.class);startActivity(i);break;
           case R.id.calories: i= new Intent(this,Calories.class);startActivity(i);break;
           default:break;

        }

    }
}
