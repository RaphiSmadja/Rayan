package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice9 {
    // LE JUSTE PRIX
    // L'ordi va générer un chiffre aléatoire et l'utilisateur va devoir le trouver
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Trouver le chiffre entre 1 et 1000");

        int random = 1 + (int)(Math.random() * ((1000 - 1) + 1));

        while(true) {
            System.out.println("Saisir un chiffre");
            int chiffreSaisie = scanner.nextInt();
            if (chiffreSaisie > random) {
                System.out.println("Moins");
            } else if (chiffreSaisie < random) {
                System.out.println("Plus");
            } else {
                System.out.println("Trouvé");
                break;
            }
        }
    }
}
