package Exercices.CodeAFaire.boucle;

import java.util.Scanner;

public class ForExo2 {
    /*
    Écrivez un programme Java qui utilise une boucle for pour calculer la factorielle d'un nombre saisi par l'utilisateur.
    La factorielle d'un nombre N est le produit de tous les entiers de 1 à N. Par exemple, la factorielle de 5 (5!) est égale à 5 * 4 * 3 * 2 * 1.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un nombre: ");
        int fact = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= fact; i++) {
            res = i * res;
        }
        System.out.println(res);
    }
}
