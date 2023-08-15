package Exercices.CodeALire;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        mysterious(nb);
    }
    public static void mysterious(int n) {
        for (int i=1; i<= n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
