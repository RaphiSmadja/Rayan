package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice12 {
    /*
    Écrivez un algorithme pour calculer le plus grand commun diviseur (GCD) de deux nombres.
     */

    // 180 et 24
    // 2 methodes différence / euclide

    // différence
    // 180 - 24 = 156
    // 156 - 24 = 132
    // 132 - 24 = 108
    // 108 - 24 = 84
    // 84 - 24 = 60
    //60 - 24 = 36
    // 36 - 24 = 12
    // 24 - 12 = 12
    // 12 - 12 = 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir a");
        int a = sc.nextInt();
        System.out.println("Sasir b");
        int b = sc.nextInt();

        int c = -1;
        while (c != 0) {
            c = a - b;
            if (b < c) {
                a = c;
            } else {
                a = b;
                b = c;
            }
        }
        System.out.println(a);
    }

}
