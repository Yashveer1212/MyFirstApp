package com.example.CutePuppyApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CutePuppy2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact2_screen);

        Button next2 = (Button)findViewById(R.id.nextFactBtn2);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next2BtnPressed();
            }
        }); // calls next activity method
    }

    private void next2BtnPressed ()
    {
        Button next2 = (Button) findViewById(R.id.nextFactBtn2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                startActivity(new Intent(CutePuppy2.this, CutePuppy3.class));
                Log.i("info", "next2 pressed");
            } // end onCLick
        });
    } // end next Puppy Button

}