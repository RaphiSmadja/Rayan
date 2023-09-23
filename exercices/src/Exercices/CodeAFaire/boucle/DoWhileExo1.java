package Exercices.CodeAFaire.boucle;

import java.util.Random;
import java.util.Scanner;

public class DoWhileExo1 {
    /*
    Exercice 1 - Boucle do-while : Jeu de Devinettes Amélioré
    Modifiez l'exercice du nombre secret en ajoutant une limite de tentatives pour l'utilisateur.
    Utilisez une boucle do-while pour permettre à l'utilisateur de deviner le nombre secret pendant un maximum de N tentatives.
    Après chaque tentative, le programme devrait indiquer si le nombre secret est plus grand ou plus petit.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int nbMystere = random.nextInt(1, 6);

        int tentative = 0;
        boolean win = false;
        do {
            System.out.println("Entrez un nombre entre 1 et 1000:");
            int nbUti = scanner.nextInt();
            if (nbMystere < nbUti) {
                System.out.println("C'est moins");
            } else if (nbMystere > nbUti) {
                System.out.println("C'est plus");
            } else {
                System.out.println("C'est égal, vous avez gagné !");
                win = true;
                break;
            }
            tentative++;
        } while (tentative < 5); //  while (tentative < 5 && win == false);
        if (win == false) {
            System.out.println("Vous avez utilisé toutes vos tentatives, vous avez perdu !");
        }
    }
}
