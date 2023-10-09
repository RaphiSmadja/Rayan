package td;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PierrePapierCiseau {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] pfc = {"pierre", "feuille", "ciseau" };
        int compteurUser = 0;
        int compteurOrdi = 0;
        do {
            System.out.println("Saisir Pierre, Feuille ou Ciseau: ");
            String choix = scanner.next();
            choix= choix.toLowerCase();
            int choixordi = random.nextInt(0,3);
            System.out.println(pfc[choixordi]);
            if (pfc[choixordi].equals(choix)) {
                System.out.println("Egalité! Recommencez.");
            } else if (pfc[choixordi].equals("pierre") && choix.equals("feuille")) {
                System.out.println("Vous avez gagner !");
                compteurUser++;
            } else if (pfc[choixordi].equals("feuille") && choix.equals("ciseau")) {
                System.out.println("Vous avez gagner !");
                compteurUser++;
            } else if (pfc[choixordi].equals("ciseau") && choix.equals("pierre")){
                System.out.println("Vous avez gagner !");
                compteurUser++;
            } else if (choix.equals("pierre") && pfc[choixordi].equals("feuille")
                    || choix.equals("feuille") && pfc[choixordi].equals("ciseau")
                    || choix.equals("ciseau") && pfc[choixordi].equals("pierre")) {
                System.out.println("Vous avez Perdu !");
                compteurOrdi++;
            }
        }while(compteurOrdi<3 && compteurUser<3);
        System.out.println("L'ordinateur a un compteur de: "+compteurOrdi+ " et vous avez un compteur de: "+compteurUser);
    }
}
