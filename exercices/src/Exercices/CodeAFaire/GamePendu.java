package Exercices.CodeAFaire;

import java.util.Scanner;

public class GamePendu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un mot ");
        // BONJOUR
        String wordMyster = scanner.next();
        int lifePoint = 5;
        char[] pendu = new char[wordMyster.length()];
        boolean findWord = false;
        boolean letterFound = false;

        for (int i = 0; i < wordMyster.length() - 1; i++) {
            pendu[i] = '_';
        }
        pendu[0] = wordMyster.charAt(0);
        pendu[wordMyster.length() - 1] = wordMyster.charAt(wordMyster.length() - 1);

        while (lifePoint > 0 && findWord == false) {
            System.out.println("Mot a trouver : " + String.valueOf(pendu));
            System.out.println("Entrez une lettre : ");
            System.out.println("il vous reste " + lifePoint + " vies");
            char letter = scanner.next().charAt(0);
            for (int i = 1; i <= pendu.length - 2; i++) {
                if (letter == wordMyster.charAt(i)) {
                    pendu[i] = letter;
                    letterFound = true;
                }
            }
            if (letterFound == false) {
                lifePoint--;
            }
            if (wordMyster.equals(String.valueOf(pendu))) {
                findWord = true;
            }
            letterFound = false;
        }
        if (findWord == true) {
            System.out.println("Bravo le mot etait : " + wordMyster);
        } else {
            System.out.println("Dommage le mot etait : " + wordMyster);
        }
    }
}
