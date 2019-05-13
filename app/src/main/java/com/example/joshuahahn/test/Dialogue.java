package com.example.joshuahahn.test;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;


public class Dialogue extends Activity {
        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            setContentView(R.layout.dialogue);
            final TextView peanut = findViewById(R.id.peanut);
        }
            @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Save Or Not");
        builder.setMessage("Do you want to save this? ");
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Dialogue.super.onBackPressed();
            }
        });
        builder.setNegativeButton("Discard", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Dialogue.super.onBackPressed();
            }
        });
        builder.show();
    }
}

