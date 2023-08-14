package Exercices;

import java.util.Scanner;

public class Exercice4 {

    /*
    Trouver le plus grand nombre
    Écrire un programme qui demande à l'utilisateur de saisir trois nombres,
    puis qui affiche le plus grand des trois.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir la valeur de a:");
        float a = sc.nextInt();
        System.out.println("Saisir la valeur de b:");
        float b = sc.nextInt();
        System.out.println("Saisir la valeur de c:");
        float c = sc.nextInt();

        if(a>b && a>c ){
            System.out.println("a est la plus grande valeur");
        } else if (b>a && b>c) {
            System.out.println("b est la plus grande valeur");
        } else{
            System.out.println("c est la plus grande valeur");
        }
    }
}
