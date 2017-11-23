package com.tse.ayoub.quizzfal;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_screen);


        TextView t = (TextView) findViewById(R.id.title);
        t.setText("Bienvenu sur QuizzFal");
        t.setTextColor(Color.BLACK);
        t.setTextSize(24);
        t.setTypeface(null, Typeface.BOLD);
        t.setGravity(Gravity.CENTER);



        Button btnNextScreen = (Button) findViewById(R.id.btn_norm);

        //Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), QuizzNormal.class);
                startActivity(nextScreen);

            }
        });
    }}














