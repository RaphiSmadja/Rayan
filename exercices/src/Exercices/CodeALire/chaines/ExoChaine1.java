package Exercices.CodeALire.chaines;

public class ExoChaine1 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.length() > 4) {
                count++;
            }
        }
        System.out.println("Number of words with more than 4 characters: " + count);
    }
}
