package Exercices.CodeAFaire.Chaines;

import java.util.Scanner;

public class ExoChaine2 {
    /*
    Ecrire une fonction nbVoyelle qui prend en parametre une chaine de charactere
    saisit par l'utilisateur et qui retourne le nombre de voyelle
     */

    public static void main(String[] args) {
        System.out.println("Ecrire un mot ");

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(ExoChaine2.nbVoyelle(word));
    }

    public static int nbVoyelle(String word) {

        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
        int cpt = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < voyelles.length; j++) {
                if (word.charAt(i) == voyelles[j]) {
                    cpt++;
                }
            }
        }
        return cpt;
    }
}
