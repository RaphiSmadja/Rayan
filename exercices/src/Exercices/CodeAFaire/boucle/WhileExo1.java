package Exercices.CodeAFaire.boucle;

import java.util.Scanner;

public class WhileExo1 {
    /*
    Exercice 1 - Boucle while : Calcul de Somme
    Écrivez un programme Java qui utilise une boucle while pour calculer la somme des chiffres d'un nombre saisi par l'utilisateur.
    Par exemple, si l'utilisateur saisit 1234, le programme doit calculer et afficher 1 + 2 + 3 + 4 = 6.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un nombre: ");

        int nb1 = sc.nextInt();
        int temp = nb1; //123
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        System.out.println(sum);

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un nombre: ");
        String nb1 = sc.next();
        int i = 0;
        int sum = 0;
        int convertChar = 0;
        while (i != nb1.length()) {
            char nbT = nb1.charAt(i);
            convertChar = Integer.parseInt(String.valueOf(nbT));
            sum += convertChar;
            i++;
        }
        System.out.println(sum);
         */
    }
}
