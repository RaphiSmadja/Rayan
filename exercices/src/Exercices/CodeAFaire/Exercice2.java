package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice2 {

    /*
    Calculer la moyenne de trois nombres
    Écrire un programme qui demande à l'utilisateur de saisir trois nombres,
    puis qui calcule et affiche leur moyenne.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Saisir le 1er nombre");
        float note1 = scanner.nextFloat();
        System.out.println("Saisir le 2eme nombre");
        float note2 = scanner.nextFloat();
        System.out.println("Saisir le 3eme nombre");
        float note3 = scanner.nextFloat();
        float result = (note1 + note2 + note3) / 3 ;
        */

        // FOR Example
        /*float note = 0;
        for (int i=0; i<3; i++) {
            System.out.println("Saisir le nombre " + (i+1));
            note = scanner.nextFloat() + note;
        }


        float result = note / 3 ;
        System.out.println("La moyenne des 3 notes est : " + result);
        */

        // While Example
        int i = 0;
        float note = 0;
        while (i != 3) {
            System.out.println("Saisir le nombre " + (i+1));
            note += scanner.nextFloat();
            i++;
        }
        System.out.println("La moyenne des 3 notes est : " + (note/3));

    }
}
