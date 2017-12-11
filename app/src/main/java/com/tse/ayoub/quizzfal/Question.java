package com.tse.ayoub.quizzfal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ayoub on 22/11/2017.
 */

public class Question {


    private String question ;
    private String reponse ;
    private String proposition1;
    private String proposition2;
    private String proposition3;
    private List<String> propositionsList = new ArrayList<String>();

    public List<String> getPropositionsList() {
        return propositionsList;
    }

    public void randomizePropositions() {

        propositionsList.add(reponse);
        propositionsList.add(proposition1);
        propositionsList.add(proposition2);
        propositionsList.add(proposition3);

        Collections.shuffle(propositionsList);

    }

    Question(String question , String reponse , String proposition1 , String proposition2 , String proposition3 ){
            this.question = question;
            this.reponse = reponse;
            this.proposition1 = proposition1;
            this.proposition2 = proposition2;
            this.proposition3 = proposition3;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getProposition1() {
        return proposition1;
    }

    public void setProposition1(String proposition1) {
        this.proposition1 = proposition1;
    }

    public String getProposition2() {
        return proposition2;
    }

    public void setProposition2(String proposition2) {
        this.proposition2 = proposition2;
    }

    public String getProposition3() {
        return proposition3;
    }

    public void setProposition3(String proposition3) {
        this.proposition3 = proposition3;
    }
}