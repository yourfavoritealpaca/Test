package com.example.joshuahahn.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


    public class popup extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.popup);

            final TextView tv = findViewById(R.id.potato);
            RatingBar rb = findViewById(R.id.ratingBar1);

            rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating,
                                            boolean fromUser) {
                    tv.setText("rating : " + rating);
                }
            });

            Button lettuce = findViewById(R.id.lettuce);

            lettuce.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent mainIntent = new Intent(popup.this,popup_done.class);
                    popup.this.startActivity(mainIntent);
                }

            });


        }
    }


// popup -> popup_complete (intent)