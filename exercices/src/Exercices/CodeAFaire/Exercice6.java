package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice6 {

    /*
    Table de multiplication
    Écrire un programme qui demande à l'utilisateur de saisir un nombre N,
    puis qui affiche la table de multiplication de ce nombre jusqu'à 10.
    2
    2 * 1 = 2
    2 * 3 = 6
    2 * 4 = 8
    2 * 5 = 10
    2 * 6 = 12
    2 * 7 = 14
    2 * 8 = 16
    2 * 9 = 18
    2 * 10 = 20
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un chiffre: ");
        int nb = sc.nextInt();
        int res;

        for (int i = 1; i < 11; i++) {
            res = i * nb;
            System.out.println("BONJOUR I = " + i + res);
            System.out.println(nb + "*" + i + "=" + res);
        }
    }
}
