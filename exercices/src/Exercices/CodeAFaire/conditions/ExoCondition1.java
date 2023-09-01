package Exercices.CodeAFaire.conditions;

import java.util.Scanner;

public class ExoCondition1 {
    /*
    Écrivez un programme Java qui demande à l'utilisateur de saisir deux nombres.
    Le programme doit ensuite afficher si le premier nombre est plus grand,
    plus petit ou égal au deuxième nombre.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un premier chiffre ou un premier nombre: ");
        int nb1 = sc.nextInt();
        System.out.println("Saisir un deuxième chiffre ou un deuxième nombre: ");
        int nb2 = sc.nextInt();

        if (nb1<nb2){
            System.out.println("Le premier nombre est inférieur au deuxième.");
        }
        else if (nb1>nb2){
            System.out.println("Le premier nombre est supérieur au deuxième.");
        }
        else {
            System.out.println("Le premier nombre est égal au deuxième.");
        }
    }
}
