import java.util.Random;
import java.util.Scanner;

public class PierrePapierCiseaux {
    public static void main(String[] args) {
        // Tableau 2x2 A
        int[][] tableauA = { {1, 2}, {3, 4} };

        // Tableau 2x2 B
        int[][] tableauB = { {5, 6}, {7, 8} };

        // Tableau résultant pour stocker l'addition
        int[][] resultat = new int[2][2];

        // Addition des tableaux A et B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultat[i][j] = tableauA[i][j] + tableauB[i][j];
            }
        }

        // Affichage du tableau résultant de l'addition
        System.out.println("Tableau résultant de l'addition :");
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}