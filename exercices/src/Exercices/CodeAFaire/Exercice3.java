package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice3 {

    /*
    Vérifier si un nombre est pair ou impair
    Écrire un programme qui demande à l'utilisateur de saisir un nombre,
    puis qui affiche si ce nombre est pair ou impair.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("saisir la valeur");
        int zaz = sc.nextInt();
        Exercice3.pairOuImpair(zaz);

    }

    public static void pairOuImpair(int nbSaisie) {
        if (nbSaisie % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
    }
}
