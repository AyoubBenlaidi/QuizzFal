package com.tse.ayoub.quizzfal;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats);

        TextView t = (TextView) findViewById(R.id.label_score);
        t.setText("Score");
        t.setTextColor(Color.BLACK);
        t.setTextSize(36);
        t.setTypeface(null, Typeface.BOLD);
        t.setGravity(Gravity.CENTER);

        Bundle extras = getIntent().getExtras();
        Integer score =0 ;

        if (extras != null) {
            score = extras.getInt("score");
        }

        TextView s = (TextView) findViewById(R.id._score);
        s.setText(score.toString());
        s.setTextColor(Color.BLACK);
        s.setTextSize(42);
        s.setTypeface(null, Typeface.BOLD);
        s.setGravity(Gravity.CENTER);

        Button btnNextScreen = (Button) findViewById(R.id.src_button);
        Button btnNextScreen2 =(Button) findViewById(R.id.quitbtn);
        btnNextScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), QuizzNormal.class);
                startActivity(nextScreen);
                

            }
        });
        btnNextScreen2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });


    }
}
