package Exercices.CodeAFaire;

import java.util.Random;
import java.util.Scanner;

public class RandomDe {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Lancez votre dé");

        // random
        int lancer = 0;

        for (int i = 1; lancer != 6; i++) {
            lancer = random.nextInt(1, 7);
            System.out.println("Dé : " + lancer);
            if (lancer == 6) {
                System.out.println("Bravo vous avez fait 6 au bout de : " + i);
            }
        }

    }
}

