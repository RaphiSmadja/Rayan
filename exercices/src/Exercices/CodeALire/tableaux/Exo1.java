package Exercices.CodeALire.tableaux;

public class Exo1 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        // Déclare un tableau d'entier avec le nom numbers et les données suivantes
        int sum = 0;
        // declare une variable sum de type entier et pour valeur 0
        // boucle initialization
        // numbers.length = 5
        for (int i = 0; i < numbers.length; i++) {
            // [i] index de i           INDEX COMMENCE TOUJOURS A 0
            // modulo = reste de la division
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                // sum += toto      // sum = sum + toto
                // sum = 0 + numbers[1]
                // sum = 10
                // sum = 30
            }
        }
        System.out.println(sum); //30
    }
}
