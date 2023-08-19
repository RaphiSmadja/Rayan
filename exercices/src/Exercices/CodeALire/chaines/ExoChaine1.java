package Exercices.CodeALire.chaines;

public class ExoChaine1 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        // Création de variable de type String et pour nom sentence et qui a pour valeur =""
        String[] words = sentence.split(" ");
        // Creation d'une variable de type tableau de String
        // words[] = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}
        // taille de words 9
        int count = 0;
        // Creation de variable de type entier pour nom count et instancié à 0
        // création d'une boucle for-each récupération de chaque élement tour par tour
        for (String titi : words) {
            // 1er tour : titi = "The"      // 2eme tour : titi = "quick"   // 3eme tour : titi = "brown"   // 4eme tour = fox // 5eme tour jumps
            // 1er tour : titi.length = 3   // 2eme tour : titi.length = 5  // 3eme tour : titi = 5     //  4 titi = 3 // 5
            if (titi.length() > 4) {
                count++;        // 2eme tour count = 1 // 3eme tour count = 2 // count = 3
            }
        }
        // affichage du nombre de characteres avec plus de 4 characters: 3
        System.out.println("Number of words with more than 4 characters: " + count);
    }
}
