package com.davids.android.londontour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers = (TextView) findViewById(R.id.attractions);


        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the attractions category is clicked on.
            @Override
            public void onClick(View view) {

                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);


                startActivity(attractionsIntent);
            }
        });


        TextView family = (TextView) findViewById(R.id.restaurants_bars);


        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants and bars category is clicked on.
            @Override
            public void onClick(View view) {

                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);


                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the activities category
        TextView colors = (TextView) findViewById(R.id.activites);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activities category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Hotels}
                Intent activitiesIntent = new Intent(MainActivity.this, Hotels.class);

                // Start the new activity
                startActivity(activitiesIntent);
            }
        });

        // Find the View that shows the parks category
        TextView phrases = (TextView) findViewById(R.id.parks);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the parks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(parksIntent);
            }
        });
    }
}
