import java.util.Random;
import java.util.Scanner;

public class PierrePapierCiseaux2 {
    public static void main(String[] args) {
        // déclaration de librairies
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // déclaration variable
        String[] tableau = {"Pierre", "Feuille", "Ciseau"};

        while (true) {
            System.out.println("Saisir Pierre, Feuille, Ciseau ou de Quitter");
            String choiceUser = scanner.next();
            if (choiceUser.equals("Quitter")) {
                break;
            } else {
                // jeu
                int randomCpu = random.nextInt(0, 3);
                String choiceCpu = tableau[randomCpu];
                System.out.println(choiceCpu);
                if ((choiceUser.equals("Pierre") && choiceCpu.equals("Ciseau")) ||
                        (choiceUser.equals("Feuille") && choiceCpu.equals("Pierre")) ||
                        (choiceUser.equals("Ciseau") && choiceCpu.equals("Feuille"))) {
                    System.out.println("Vous avez gagné");
                } else if (choiceUser.equals(choiceCpu)) {
                    System.out.println("Egalité");
                } else {
                    System.out.println("Vous avez perdue");
                }
            }
        }
    }
}
