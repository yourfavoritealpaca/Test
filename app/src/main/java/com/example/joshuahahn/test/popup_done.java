package com.example.joshuahahn.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


public class popup_done extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_complete);

        Button potato = findViewById(R.id.potato);

        potato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent mainIntent = new Intent(popup_done.this, calculator.class);
                popup_done.this.startActivity(mainIntent);

                }
        });
    }
}


