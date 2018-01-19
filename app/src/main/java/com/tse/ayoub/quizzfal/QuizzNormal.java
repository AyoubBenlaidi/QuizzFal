package com.tse.ayoub.quizzfal;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizzNormal extends AppCompatActivity {



    private Question q1 =new Question("Quel est l'emblème des étudiants en kiné ?" , "Caducée mercure",
            "Coq " , "Etoile et foudre " , "Palette et pinceau") ;
    private Question q2 =new Question("Quel est le circulaire des étudiants en médecine ?" , "Velour rouge",
            "Velour Rose " , "Satin violet " , "Satin argenté") ;
    private Question q3 =new Question("Quel est l'emblème des étudiants en Ostéopathie ?" , "Sphénoîde",
            "Caducée mercure " , "Casque de périclès " , "Palette et pinceau") ;
    private Question q4 =new Question("Quel est le circulaire des étudiants en STAPS/UFRAPS ?" , "Satin vert foncé",
            "Satin vert clair " , "Velour Bleu" , "Satin orange") ;
    private Question q5 =new Question("Quel est l'emblème des étudiants en Histoire ?" , "Casque de périclès",
            "Coq " , "Caducée mercure " , "Grenouille") ;

    private Integer questionNumber=0 ;
    private Integer score=0 ;
    private String reponse;
    Question listeQuestions[]={q1,q2,q3,q4,q5} ;

     private Button _button1 ;

     private Button _button2 ;

     private Button _button3 ;

     private Button _button4;




    private TextView t ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_normal);
        q1.randomizePropositions();
        q2.randomizePropositions();
        q3.randomizePropositions();
        q4.randomizePropositions();
        q5.randomizePropositions();

        _button1 = (Button)findViewById(R.id.btn_prop1);
        _button2 = (Button)findViewById(R.id.btn_prop2);
        _button3 = (Button)findViewById(R.id.btn_prop3);
        _button4 = (Button)findViewById(R.id.btn_prop4);
        t = (TextView) findViewById(R.id.question);

        t.setTextColor(Color.BLACK);
        t.setTextSize(36);
        t.setGravity(Gravity.CENTER);


        updateQuestion();


        _button1.setText(q1.getPropositionsList().get(0).toString());

         _button2.setText(q1.getPropositionsList().get(1).toString());

        _button3.setText(q1.getPropositionsList().get(2).toString());

        _button4.setText(q1.getPropositionsList().get(3).toString());


        _button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (_button1.getText() == reponse){
                    score++ ;

                    updateQuestion();


                }else {

                    updateQuestion();
                }
            }
        });

        _button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (_button2.getText() == reponse){
                    score++ ;

                    updateQuestion();


                }else {

                    updateQuestion();
                }
            }
        });



        _button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (_button3.getText() == reponse){
                    score++ ;

                    updateQuestion();


                }else {

                    updateQuestion();
                }
            }
        });


        _button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (_button4.getText() == reponse){
                    score++ ;

                    updateQuestion();


                }else {

                    updateQuestion();
                }
            }
        });




    }
    private void updateQuestion(){
        t.setText(listeQuestions[questionNumber].getQuestion());
        _button1.setText(listeQuestions[questionNumber].getPropositionsList().get(0));
        _button2.setText(listeQuestions[questionNumber].getPropositionsList().get(1));
        _button3.setText(listeQuestions[questionNumber].getPropositionsList().get(2));
        _button4.setText(listeQuestions[questionNumber].getPropositionsList().get(3));
        reponse  = listeQuestions[questionNumber].getReponse() ;
        questionNumber++;


        if(questionNumber == 5 ){
            //Starting a new Intent
            Intent nextScreen = new Intent(getApplicationContext(), Resultats.class);
            nextScreen.putExtra("score" ,score) ;
            startActivity(nextScreen);
            finish();

        }
    }




}
