package Exercices.CodeALire;

import java.util.Arrays;
import java.util.Scanner;

public class JeuDuPendu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le mot à deviner : ");
        String motADeviner = scanner.nextLine().toUpperCase();
        clearConsole();

        char[] motAffiche = new char[motADeviner.length()];
        for (int i = 0; i < motAffiche.length; i++) {
            motAffiche[i] = '_';
        }

        motAffiche[0] = motADeviner.charAt(0); // Afficher la première lettre
        motAffiche[motADeviner.length() - 1] = motADeviner.charAt(motADeviner.length() - 1); // Afficher la dernière lettre


        int viesRestantes = 5;
        boolean motTrouve = false;

        while (viesRestantes > 0 && !motTrouve) {
            System.out.println("Mot à deviner : " + Arrays.toString(motAffiche));
            System.out.println("Vies restantes : " + viesRestantes);
            System.out.print("Entrez une lettre : ");
            char lettre = scanner.next().toUpperCase().charAt(0);

            boolean lettreTrouvee = false;
            for (int i = 0; i < motADeviner.length(); i++) {
                if (motADeviner.charAt(i) == lettre) {
                    motAffiche[i] = lettre;
                    lettreTrouvee = true;
                }
            }

            if (!lettreTrouvee) {
                viesRestantes--;
            }

            if (new String(motAffiche).equals(motADeviner)) {
                motTrouve = true;
            }
        }

        if (motTrouve) {
            System.out.println("Félicitations, vous avez trouvé le mot : " + motADeviner);
        } else {
            System.out.println("Dommage, vous avez perdu. Le mot était : " + motADeviner);
        }

        scanner.close();
    }


    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
