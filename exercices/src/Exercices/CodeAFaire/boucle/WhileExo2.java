package Exercices.CodeAFaire.boucle;

import java.util.Scanner;

public class WhileExo2 {
    /*
    Écrivez un programme Java qui utilise une boucle while pour compter le nombre d'occurrences d'un chiffre spécifique dans un nombre saisi par l'utilisateur.
    Par exemple, si l'utilisateur saisit le nombre 122345 et le chiffre 2, le programme devrait afficher le nombre d'occurrences : 2.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un nombre: ");
        int nb1 = sc.nextInt();
        System.out.println("Saisir une occurence: ");
        int occu = sc.nextInt();
        int cpt = 0;
        int div = -1;
        while (div != 0) {
            div = nb1 / 10;
            int reste = nb1 % 10;
            if (reste == occu) {
                cpt++;
            }
            nb1 = div;
        }
        System.out.println("cpt = " + cpt);

    }

}
