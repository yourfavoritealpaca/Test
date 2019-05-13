package com.example.joshuahahn.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tomato extends AppCompatActivity {

        public void onCreate(Bundle icicle) {

            super.onCreate(icicle);
            setContentView(R.layout.background);

            Button buttonpopup = findViewById(R.id.button_popup);
            final TextView complete = findViewById(R.id.complete);

            buttonpopup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    complete.setText("Complete");

                    Intent mainIntent = new Intent(Tomato.this,popup.class);
                    Tomato.this.startActivity(mainIntent);
                }

            });

        }
    }

