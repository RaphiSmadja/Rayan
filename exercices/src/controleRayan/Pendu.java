package controleRayan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pendu {

    public static void main(String[] args) {
        // Déclaration
        System.out.println("Le jeu du pendu");
        System.out.println("Veuillez saisir un mot");

        Scanner scanner = new Scanner(System.in);
        String secretWord = scanner.next();

        // logic
        gameLogic(secretWord);
    }

    public static void gameLogic(String secretWord) {
        // déclaration
        Scanner scanner = new Scanner(System.in);
        int life = 10;
        boolean findWord = false;

        // copy de secret word
        char[] copySecret = new char[secretWord.length()];
        copySecret[0] = secretWord.charAt(0);
        copySecret[secretWord.length() - 1] = secretWord.charAt(secretWord.length() - 1);

        // base du jeu
        while (life > 0 && findWord == false) {
            System.out.println(Arrays.toString(copySecret));
            System.out.println("Il vous reste "+life+" chance(s)");

            System.out.println("Saisir une lettre");
            char letter = scanner.next().charAt(0);

            // checker si la lettre existe dans le secret word
            List<Integer> checkAllIndex = checkAllIndex(secretWord, letter);

            // 1ere verification
            if (checkAllIndex.size() == 0) {
                life--;
                System.out.println("Vous avez perdu une vie");
            } else {
                // 2eme check checker si le tableau d'index est déja rempli dans la copy
                boolean flag = checkInCopyWordAllIndex(secretWord, copySecret, checkAllIndex);
                if (flag == false) {
                    life--;
                    System.out.println("Vous avez perdu une vie");
                } else {
                    for (int i : checkAllIndex) {
                        copySecret[i] = secretWord.charAt(i);
                    }
                }
            }
            findWord = secretWord.equals(String.copyValueOf(copySecret));
        }
        if (life == 0) {
            System.out.println("Vous avez perdue");
        } else {
            System.out.println("Vous avez gagné");
        }
    }

    public static List<Integer> checkAllIndex(String secretWord, char letter) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < secretWord.length(); i++) {
            if (letter == secretWord.charAt(i)) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static boolean checkInCopyWordAllIndex(String secretWord, char[] copyWord, List<Integer> checkAllIndex) {
        boolean flag = false;
        for (int i = 0; i < checkAllIndex.size(); i++) {
            int key = checkAllIndex.get(i);
            if (copyWord[key] != secretWord.charAt(key)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
