package Exercices.CodeAFaire;

import java.util.Arrays;

public class Exercice5 {
    public static void mysterious(int[] tableau, int positions) {
        int longueur = tableau.length;

        positions = positions % longueur;

        for (int i = 0; i < positions; i++) {
            int premierElement = tableau[0]; //2

            for (int j = 0; j < longueur - 1; j++) {
                tableau[j] = tableau[j + 1]; // 2 3 4 5
                                             // 3 4 5 1
            }

            tableau[longueur - 1] = premierElement; // 3 4 5 1 2
        }
    }

    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        int positions = 4;

        System.out.println("Tableau avant mysterious : " + Arrays.toString(tableau));
        mysterious(tableau, positions);
        System.out.println("Tableau après mysterious : " + Arrays.toString(tableau));
    }
}
