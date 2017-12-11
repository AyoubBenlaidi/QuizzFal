package com.tse.ayoub.quizzfal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by darkavlyss on 11/12/2017.
 */

public class QuestionController {
    private Random random = new Random();



    public Question createQuestion(){
        Question question;

        int typeQuestion = random.nextInt(3);
        int normaleOuInverse = random.nextInt(2);

        List<String> buildQuestion = new ArrayList<>();

        if(typeQuestion == 0){
            buildQuestion = createCircuQuestion(normaleOuInverse);
        }else if(typeQuestion == 1){
            buildQuestion = createEmblemeQuestion(normaleOuInverse);
        }else {
            buildQuestion = createInsigneQuestion(normaleOuInverse);
        }

        question = new Question(buildQuestion[0], buildQuestion[1], buildQuestion[2], buildQuestion[3], buildQuestion[4]);

        question.randomizePropositions();

        return question;
    }

    private List<String> createInsigneQuestion(int normaleOuInverse) {
        String question = "";

        //TODO
        //requete nombre de lignes => random.nextInt(nbLignes)

        //TODO
        //requete insigne sur la ligne designee avant

        if (normaleOuInverse == 0){
            question += "Quelle insigne signifie " /* + sens + " ?" */;
            //TODO
            //requete reponses => on recup une liste de 3 rep
        }else {
            question += "Que signifie " /* + insigne + " ?" */;
            //TODO
            //requete reponses => on recup une liste de 3 rep
        }

        List<String> listeQuestion = new ArrayList<>();
        listeQuestion.add(question);
        /*
        listeQuestion.add(vraiReponse);
        listeQuestion.addAll(listeFaussesReponses);
        */

        return null;
    }

    private List<String> createEmblemeQuestion(int normaleOuInverse) {
        String question = "";

        //TODO
        //requete nombre de lignes => random.nextInt(nbLignes)

        //TODO
        //requete insigne sur la ligne designee avant

        if (normaleOuInverse == 0){
            question += "Quelle embleme represente la filere " /* + filiere + " ?" */;
            //TODO
            //requete reponses => on recup une liste de 3 rep
        }else {
            question += "Quelle filiere est representee par " /* + embleme + " ?" */;
            //TODO
            //requete reponses => on recup une liste de 3 rep
        }

        List<String> listeQuestion = new ArrayList<>();
        listeQuestion.add(question);
        /*
        listeQuestion.add(vraiReponse);
        listeQuestion.addAll(listeFaussesReponses);
        */

        return null;
    }

    private List<String> createCircuQuestion(int normaleOuInverse) {
        String question = "";

        //TODO
        //requete nombre de lignes => random.nextInt(nbLignes)

        //TODO
        //requete insigne sur la ligne designee avant

        if (normaleOuInverse == 0){
            question += "Quelle circulaire represente la filere " /* + circu + " ?" */;
            //TODO
            //requete reponses => on recup une liste de 3 rep
        }else {
            question += "Quelle filiere est representee par " /* + matiere + couleur + " ?" */;
            //TODO
            //requete reponses => on recup une liste de 3 rep
        }

        List<String> listeQuestion = new ArrayList<>();
        listeQuestion.add(question);
        /*
        listeQuestion.add(vraiReponse);
        listeQuestion.addAll(listeFaussesReponses);
        */

        return null;
    }
}
