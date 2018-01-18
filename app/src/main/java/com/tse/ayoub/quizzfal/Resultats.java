package com.tse.ayoub.quizzfal;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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



    }
}
