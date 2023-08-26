package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice10 {
    /*
    Exercice 10: Recherche Linéaire
    Écrivez un algorithme qui recherche un élément donné dans un tableau non trié
    en utilisant la recherche linéaire. Si l'élément est présent, l'algorithme doit renvoyer son index ;
    sinon, il doit renvoyer -1.
    3 saisies
    1 saisi la taille du tableau
    2 saisi les elements du tableau
    3 saisi l'element recherche

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir la taille du tableau: ");
        int arraySize = sc.nextInt();

        int[] tableau = new int[arraySize];
        System.out.println("Saisir les élèments du tableau: ");
        int nbChoice;
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Element " + (i + 1));
            nbChoice = sc.nextInt();
            tableau[i] = nbChoice;
            /*System.out.print(" [ ");
            for (int j=0; j<tableau.length; j++) {
                System.out.print( " " + tableau[j] + " ");
            }
            System.out.println(" ] ");
             */
        }

        System.out.println("Saisir l'élèment recherche: ");
        int nbRecherche = sc.nextInt();

        for (int i = 0; i < tableau.length - 1; i++) {
            if (nbRecherche == tableau[i]) {
                System.out.println("Trouvé à l'index " + i);
                break; // on casse la boucle (sort)
            }
        }
    }
}
