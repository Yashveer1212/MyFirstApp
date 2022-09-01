package com.example.CutePuppyApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CutePuppy1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact1_screen);

        Button next = (Button)findViewById(R.id.nextFactBtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextBtnPressed();
            }
        }); // listener that calls next activity method
    }

    private void nextBtnPressed ()
    {
        Button next = (Button) findViewById(R.id.nextFactBtn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                startActivity(new Intent(CutePuppy1.this, CutePuppy2.class));
                Log.i("info", "next1 pressed");
            } // end onCLick
        });
    } // end next Puppy Button

}