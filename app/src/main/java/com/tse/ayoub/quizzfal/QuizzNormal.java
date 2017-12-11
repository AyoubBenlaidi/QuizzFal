package com.tse.ayoub.quizzfal;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;

public class QuizzNormal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_normal);



        Question q1 =new Question("Quel est l'emblème des étudiants en kiné ?" , "Caducée mercure",
                "Coq " , "Etoile et foudre " , "Palette et pinceau") ;
       q1.randomizePropositions();

        TextView t = (TextView)findViewById(R.id.question);
        t.setText(q1.getQuestion());
        t.setTextColor(Color.BLACK);
        t.setTextSize(36);
        t.setGravity(Gravity.CENTER);


        Button _button1 = (Button)findViewById(R.id.btn_prop1);
        _button1.setText(q1.getPropositionsList().get(0).toString());

        Button _button2 = (Button)findViewById(R.id.btn_prop2);
        _button2.setText(q1.getPropositionsList().get(1).toString());

        Button _button3 = (Button)findViewById(R.id.btn_prop3);
        _button3.setText(q1.getPropositionsList().get(2).toString());

        Button _button4 = (Button)findViewById(R.id.btn_prop4);
        _button4.setText(q1.getPropositionsList().get(3).toString());

    }
}
