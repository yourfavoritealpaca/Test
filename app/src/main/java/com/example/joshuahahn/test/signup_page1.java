package com.example.joshuahahn.test;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signup_page1 extends AppCompatActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.signup_page1);

        Button b = (Button)findViewById(R.id.button_facebook);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText (getApplicationContext(),"Bye bye :(",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);
    }
});
    }
}