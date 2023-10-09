package td;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        //factorielle();
        //countDown();
        //carres();
        //tableMultiplication();
        division();
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    public static void countDown() {
        int n = 1;
        for (int i = 10; i >= n; i--) {
            System.out.println(i);
        }
        System.out.println("BOOOMMM");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrez une valeur x: ");
        int valeur = scanner.nextInt();
        System.out.println(valeur + "        " + valeur * valeur);
    }


    public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "    ");
            }
            System.out.println();
        }
        /*for (int i=1; i<=10; i++) {
            int n=1;
            n++;
            System.out.print(i*n + "    ");

        }*/
    }


    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un premier nombre entier: ");
        int nb1 = scanner.nextInt();
        System.out.println("Saisir un deuxième nombre entier: ");
        int nb2 = scanner.nextInt();
        while (nb2 == 0) {
            System.out.println("Erreur resaisir un deuxième nombre entier: ");
            nb2 = scanner.nextInt();
        }
        if (nb1 < nb2) {    // nb1 = 2 et nb2 = 5
            int tmp = nb2;  // tmp = 5
            nb2 = nb1;      // nb2 = 2
            nb1 = tmp;      // nb1 = 5
        }
        System.out.println(nb1 / nb2);
    }
}
