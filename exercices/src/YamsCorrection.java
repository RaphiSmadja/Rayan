import java.util.Arrays;
import java.util.Random;

public class YamsCorrection {
    private static final int NUM_DICE = 5;
    private int[] diceValues;
    private int[] scoreCard;
    private int rollsLeft;

    public YamsCorrection() {
        diceValues = new int[NUM_DICE];
        scoreCard = new int[Combination.values().length];
        rollsLeft = 3;
    }

    public void rollDice() {
        Random random = new Random();
        for (int i = 0; i < NUM_DICE; i++) {
            diceValues[i] = random.nextInt(6) + 1; // Roll a 6-sided die
        }
    }

    public void displayDice() {
        System.out.println("Dice: " + Arrays.toString(diceValues));
    }

    public void displayScoreCard() {
        System.out.println("Score Card:");
        for (Combination combo : Combination.values()) {
            System.out.println(combo + ": " + scoreCard[combo.ordinal()]);
        }
    }

    public void chooseCombination(Combination combo) {
        if (rollsLeft > 0) {
            // Calculate score for the chosen combination
            int score = calculateScore(combo);
            scoreCard[combo.ordinal()] = score;
            rollsLeft = 3; // Reset rolls
        } else {
            System.out.println("No rolls left. Choose a combination from the score card.");
        }
    }

    private int calculateScore(Combination combo) {
        // Implement scoring logic for each combination here
        // For example, you can calculate the score for a "Three of a Kind" like this:
        // if (combo == Combination.THREE_OF_A_KIND) {
        //     // Calculate score...
        // }

        return 0; // Placeholder for the score
    }

    public static void main(String[] args) {
        YamsCorrection game = new YamsCorrection();
        game.play();
    }

    public void play() {
        while (true) {
            System.out.println("Rolls left: " + rollsLeft);
            rollDice();
            displayDice();
            displayScoreCard();

            if (rollsLeft == 0) {
                System.out.println("Game over!");
                break;
            }

            // Allow the player to choose a combination
            // Example: chooseCombination(Combination.THREE_OF_A_KIND);
        }
    }
}

enum Combination {
    ONES,
    TWOS,
    THREES,
    FOURS,
    FIVES,
    SIXES,
    THREE_OF_A_KIND,
    FOUR_OF_A_KIND,
    FULL_HOUSE,
    SMALL_STRAIGHT,
    LARGE_STRAIGHT,
    YAMS,
    CHANCE
}