package Exercices.CodeAFaire;

import java.util.Scanner;

public class Exercice13 {
    /*
    Exercice 13 : Conversion de température
    Écrivez un algorithme qui demande à l'utilisateur de saisir une température en degrés Celsius
    et la convertit en degrés Fahrenheit en utilisant la formule de conversion : F = (C × 9/5) + 32.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir une température en degrés Celsius: ");
        float degrésCelsius = sc.nextFloat();
        float fahrenheit = (degrésCelsius * 9 / 5) + 32;

        System.out.println("La température en Fahrenheit est de:" + fahrenheit);
    }
}
