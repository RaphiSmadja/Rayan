package Exercices.CodeAFaire.conditions;

import java.util.Scanner;

public class ExoCondition2 {
    /*
    Écrivez un programme Java qui demande à l'utilisateur de saisir un nombre.
    Le programme doit afficher si le nombre est pair ou impair.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un nombre: ");
        int nb1 = sc.nextInt();

        if (nb1 % 2 ==0){
            System.out.println("Le nombre est pair");
        }
        else {
            System.out.println("Le nombre est impair");
        }
    }
}
