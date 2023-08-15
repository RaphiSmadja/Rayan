package Exercices.CodeAFaire.Chaines;

import java.util.Scanner;

public class ExoChaine3 {
    /*
    Exercice : Vérification de palindrome fait
    Écrivez un algorithme qui demande à l'utilisateur de saisir une chaîne de caractères
    et affiche si cette chaîne est un palindrome (c'est-à-dire qu'elle se lit
    de la même manière de gauche à droite et de droite à gauche).

    radar
    non
    oui != iuo
    String = Tableau
    Creer une fonction avec le mot saisie par l'utilisateur et on retourne vrai ou faux si c'est un palindrome
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un mot");
        String receivedWord = sc.next();

        boolean res = isPalyndrome(receivedWord);
        System.out.println(res);
    }

    public static boolean isPalyndrome(String word) {
        String reverseWord = "";
        for (int i = word.length() -1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        System.out.println(reverseWord);
        boolean res = word.equals(reverseWord);
        return res;
    }


}
