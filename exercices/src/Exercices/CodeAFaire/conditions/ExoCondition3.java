package Exercices.CodeAFaire.conditions;

import java.util.Scanner;

public class ExoCondition3 {
    /*
Écrivez un programme Java qui demande à l'utilisateur de saisir une note entre 0 et 100.
Le programme doit afficher la mention correspondante : "Très insuffisant" pour les notes en dessous de 40,
"Insuffisant" pour les notes entre 40 et 59, "Satisfaisant" pour les notes entre 60 et 79, et "Excellent" pour les notes de 80 et plus.
     */

// 5 / 10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir une note en 0 et 100: ");
        int note = sc.nextInt();

        if (note <= 40) {
            System.out.println("La note est très insuffisante.");
        } else if (note > 40 && note <= 59) {
            System.out.println("La note est insuffisante.");
        } else if (note > 59 && note <= 79) {
            System.out.println("La note est satisfaisante.");
        } else {
            System.out.println("La note est excellente.");
        }
    }
}
