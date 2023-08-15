package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice7 {

    /*
    Calculer le factoriel d'un nombre
    Écrire un programme qui demande à l'utilisateur de saisir un nombre N,
     puis qui calcule et affiche son factoriel (N!).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre ou un chiffre");
        int nb = scanner.nextInt();
        int res = 1;
        /*for(int i = nb; i > 1 ; i--){
            res = res * i;
            System.out.println(res);
        }
        */
        for (int i = 1; i <= nb; i++) {
            res = res * i;
            //  1er tour; i = 1 ; res = 1 * 1 = 1 ; i = 2
            //  2eme tour; i = 2  ; res = 2 * 1 = 2 ; i = 3
            //  3eme tour; i = 3 ; res = 2 * 3 = 6 ; i = 4
            //  4eme tour; i = 4 ; res = 6 * 4 = 24; i = 5
            //  5eme tour; i = 5 ; res = 24 * 5 = 120; i = 6
        }
        System.out.println(res);
    }

    // 5
    // res = 1
    // 1er tour res = res * 5 || res = 5
    // 2eme tour res = res * 4 || res = 20
    // 3eme tout res = res * 3 || res = 60
    // 4eme tour res = res * 2 || res = 120
    // 5eme tour res = res * 1 || res = 120
}
