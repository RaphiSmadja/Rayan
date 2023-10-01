package Exercices.CodeAFaire.tp1;

import java.util.*;

public class MasterMyster {

    private static final int CODE_LENGTH = 4;  // Longueur du code secret
    private static final int MAX_GUESSES = 10;  // Nombre maximum d'essais

    private static final char[] COLORS = {'R', 'G', 'B', 'Y', 'O', 'P'};

    private char[] secretCode;

    public MasterMyster() {
        generateSecretCode();
    }

    private void generateSecretCode() {
        Random random = new Random();
        secretCode = new char[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            secretCode[i] = COLORS[random.nextInt(COLORS.length)];
        }
    }

    private String promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre proposition (par ex. RGBO) : ");
        return scanner.nextLine().toUpperCase();
    }

    private int[] evaluateGuess(String guess) {
        int[] result = new int[2];  // result[0] : nombre de bonnes positions, result[1] : nombre de bonnes couleurs

        List<Character> secretCodeList = new ArrayList<>();
        for (char c : secretCode) {
            secretCodeList.add(c);
        }

        for (int i = 0; i < CODE_LENGTH; i++) {
            if (guess.charAt(i) == secretCode[i]) {
                result[0]++;
                secretCodeList.set(i, ' ');
            }
        }

        for (int i = 0; i < CODE_LENGTH; i++) {
            char currentGuessChar = guess.charAt(i);
            if (currentGuessChar != secretCode[i] && secretCodeList.contains(currentGuessChar)) {
                result[1]++;
                secretCodeList.remove(secretCodeList.indexOf(currentGuessChar));
            }
        }

        return result;
    }

    public void play() {
        System.out.println("Bienvenue dans Mastermind !");
        System.out.println("Essayez de deviner la combinaison de " + CODE_LENGTH + " couleurs (R, G, B, Y, O, P).");

        int guessesLeft = MAX_GUESSES;

        while (guessesLeft > 0) {
            String guess = promptForGuess();
            int[] evaluation = evaluateGuess(guess);

            System.out.println("Résultat : " + Arrays.toString(evaluation));

            if (evaluation[0] == CODE_LENGTH) {
                System.out.println("Félicitations ! Vous avez trouvé la combinaison secrète.");
                return;
            }

            guessesLeft--;
            System.out.println("Il vous reste " + guessesLeft + " essais.");
        }

        System.out.println("Vous avez utilisé tous vos essais. La combinaison secrète était : " + Arrays.toString(secretCode));
    }

    public static void main(String[] args) {
        MasterMyster game = new MasterMyster();
        game.play();
    }
}
