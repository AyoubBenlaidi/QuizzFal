package com.tse.ayoub.quizzfal;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizzNormal extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_normal);




        Question q1 =new Question("Quel est l'emblème des étudiants en kiné ?" , "Caducée mercure",
                "Coq " , "Etoile et foudre " , "Palette et pinceau") ;
        Question q2 =new Question("Quel est le circulaire des étudiants en médecine ?" , "Velour rouge",
                "Velour Rose " , "Satin violet " , "Satin argenté") ;
        Question q3 =new Question("Quel est l'emblème des étudiants en Ostéopathie ?" , "Sphénoîde",
                "Caducée mercure " , "Casque de périclès " , "Palette et pinceau") ;
        Question q4 =new Question("Quel est le circulaire des étudiants en STAPS/UFRAPS ?" , "Satin vert foncé",
                "Satin vert clair " , "Velour Bleu" , "Satin orange") ;
        Question q5 =new Question("Quel est l'emblème des étudiants en Histoire ?" , "Casque de périclès",
                "Coq " , "Caducée mercure " , "Grenouille") ;


        q1.randomizePropositions();
        q2.randomizePropositions();
        q3.randomizePropositions();
        q4.randomizePropositions();
        q5.randomizePropositions();


        System.out.println("===================Questions created ================================");
        int q =5 ;

        while(q>=0)
        {
            TextView t = (TextView) findViewById(R.id.question);

            t.setText(q1.getQuestion());
            t.setTextColor(Color.BLACK);
            t.setTextSize(36);
            t.setGravity(Gravity.CENTER);

            System.out.println("==================="+q+"=======================");


            final Button _button1 = (Button)findViewById(R.id.btn_prop1);
            _button1.setText(q1.getPropositionsList().get(0).toString());

            final Button _button2 = (Button)findViewById(R.id.btn_prop2);
            _button2.setText(q1.getPropositionsList().get(1).toString());

            final Button _button3 = (Button)findViewById(R.id.btn_prop3);
            _button3.setText(q1.getPropositionsList().get(2).toString());

            final Button _button4 = (Button)findViewById(R.id.btn_prop4);
            _button4.setText(q1.getPropositionsList().get(3).toString());






        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.equals(_button1)) {
                    System.out.println("Button 1 clicked ");

                } else {
                    // do something else
                }
            }
        };


        _button1.setOnClickListener(listener);
        _button2.setOnClickListener(listener);
        _button3.setOnClickListener(listener);
        _button4.setOnClickListener(listener);



        }
/*
        Intent intent = new Intent(QuizzNormal.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
*/


    }
}
