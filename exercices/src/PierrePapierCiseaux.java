import java.util.Random;
import java.util.Scanner;

public class PierrePapierCiseaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choixPossibles = {"pierre", "papier", "ciseaux"};

        while (true) {
            System.out.print("Choisissez pierre, papier ou ciseaux (ou quit pour sortir) : ");
            String choixJoueur = scanner.nextLine().toLowerCase();

            if (choixJoueur.equals("quit")) {
                System.out.println("Au revoir !");
                break;
            }

            if (!choixJoueur.equals("pierre") && !choixJoueur.equals("papier") && !choixJoueur.equals("ciseaux")) {
                System.out.println("Choix invalide. Veuillez choisir pierre, papier ou ciseaux.");
                continue;
            }

            int indexChoixOrdinateur = random.nextInt(3);
            String choixOrdinateur = choixPossibles[indexChoixOrdinateur];

            System.out.println("L'ordinateur choisit " + choixOrdinateur);

            if (choixJoueur.equals(choixOrdinateur)) {
                System.out.println("Égalité !");
            } else if (
                (choixJoueur.equals("pierre") && choixOrdinateur.equals("ciseaux")) ||
                (choixJoueur.equals("ciseaux") && choixOrdinateur.equals("papier")) ||
                (choixJoueur.equals("papier") && choixOrdinateur.equals("pierre"))
            ) {
                System.out.println("Vous gagnez !");
            } else {
                System.out.println("L'ordinateur gagne !");
            }
        }
    }
}