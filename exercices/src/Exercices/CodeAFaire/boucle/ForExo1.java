package Exercices.CodeAFaire.boucle;

import java.util.Scanner;

public class ForExo1 {
    /*
    Écrivez un programme Java qui utilise une boucle for pour afficher la table de multiplication d'un nombre saisi par l'utilisateur.
    Le programme devrait afficher la table de multiplication de ce nombre jusqu'à un certain multiple (par exemple, jusqu'à 10).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un nombre: ");
        int nb1 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int res = nb1 * i;
            System.out.println(+nb1 + " " + "*" + " " + i + " " + "=" + " " + res);
            //System.out.println(nb1 + " * " + i + " = " + nb1 * i);

        }
    }


}
