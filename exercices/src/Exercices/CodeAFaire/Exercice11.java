package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice11 {
    /*
    Écrivez une fonction pour compter le nombre d'occurrences d'un élément donné dans un tableau.
    avec un tableau de string
     Exemple
     ["bob","alice","jean","bob","pierre","david","bob","alice","david","alice","jean"]
     bob
     3
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saississez votre mot: ");
        String mot = sc.next();

        String[] tableau = {"bob", "alice", "jean", "bob", "pierre", "david", "bob", "alice", "david", "alice", "jean"};
        int cpt = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (mot.equals(tableau[i])) {
                cpt++;
            }
        }
        System.out.println("le nombre d'occurence est : " + cpt);
    }

}
