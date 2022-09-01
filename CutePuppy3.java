package com.example.CutePuppyApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CutePuppy3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact3_screen);

        Button backMain = (Button)findViewById(R.id.backMainBtn);

        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backMainPressed();
            }
        }); //calls next activity method
    }

    private void backMainPressed ()
    {
        Button back2main = (Button) findViewById(R.id.backMainBtn);
        back2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                Toast.makeText(getBaseContext(), "Yahh, are you happy now", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(CutePuppy3.this, MainActivity.class));
                Log.i("info", "back2main pressed");
            } // end onCLick
        });
    } // end start button handler
}