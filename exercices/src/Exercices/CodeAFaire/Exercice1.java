package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice1 {

    /*
    Calculer la somme de deux nombres
    Écrire un programme qui demande à l'utilisateur de saisir deux nombres,
    puis qui affiche leur somme.
     */
    public static void main(String[] args) {
        // Instancier le Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le 1er nombre");
        int nb1 = scanner.nextInt();
        System.out.println("Saisir le 2eme nombre");
        int nb2 = scanner.nextInt();

        // la somme de nb1 + nb2
        int result = nb1 + nb2;

        System.out.println("La somme est égale à : " + result);
    }
}
