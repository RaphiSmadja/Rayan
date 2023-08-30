package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice14 {
    /*
    Écrivez un algorithme qui génère les n premiers termes de la suite de Fibonacci.
    La suite de Fibonacci est une séquence de nombres dans laquelle chaque nombre est la somme des deux nombres précédents.
    Les deux premiers termes de la suite sont généralement définis comme 0 et 1.
    0 1 2 3 5 8 13 21
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Définir la limite de la suite de Fibonacci:");
        int indexFibonacci = sc.nextInt();

        int nbMoin2 = 0;
        int nbMoin1 = 1;

        int nbFibonnacci;

        System.out.println(0);
        System.out.println(1);

        for (int i = 2; i <= indexFibonacci; i++) {
            nbFibonnacci = nbMoin1 + nbMoin2;
            nbMoin2 = nbMoin1;
            nbMoin1 = nbFibonnacci;
            System.out.println(nbFibonnacci);
        }
        
    }
}
