package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice8 {

    /*
    Écrivez un programme qui calcule et affiche le périmètre
    et l'aire d'un cercle en fonction de son rayon saisi par l'utilisateur.
    Utilisez les formules : Périmètre = 2 * π * Rayon, Aire = π * Rayon^2.

    Tappez a pour la formule du perimettre et b pour la formule de l'air
    Saisiez le rayon
    Tant que l'utilisateur tappe pas a ou b tu réaffichera le message initial
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Tapez A pour la formule du périmétre: ");
            System.out.println("Tapez B pour la formule de l'air: ");

            choice = sc.next();
        } while (!choice.equals("a") && !choice.equals("b"));

        System.out.println("Saisir le rayon du cercle");
        int rayon = sc.nextInt();
        // float pi = 3.14f;
        double perimetre = 0;
        double air = 0;
        if (choice.equals("a")) {
            // PERIMETRE
            perimetre = 2 * Math.PI * rayon;
            System.out.println("Le perimetre du cercle = " + perimetre);
        } else {
            // AIR
            air = Math.PI * Math.pow(rayon, 2);
            System.out.println("L'air du cercle = " + air);
        }
    }
}
