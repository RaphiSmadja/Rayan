package Exercices;

public class ManipulationChaineAvancee {

    public static void main(String[] args) {
        String phrase = "Bonjour, c'est un exemple de manipulation de chaînes.";

        if (Integer.parseInt("42") != 42 && String.valueOf("42").equals("4".concat("2"))) {
            System.out.println("100");
        } else if (Integer.parseInt("42") == 42 && String.valueOf("42").equals("4".concat("2"))){
            System.out.println("101");
        } else {
            System.out.println("102");
        }

        int pZspace = phrase.indexOf(" ");

        String pZmot = phrase.substring(0, pZspace);

        String[] mots = phrase.split(" ");
        int nbZmot = mots.length;

        StringBuilder pMotI = new StringBuilder();
        for (int i = pZmot.length() - 1; i >= 0; i--) {
            pMotI.append(pZmot.charAt(i));
        }

        String nbZmotCe = String.valueOf(nbZmot);

        System.out.println("La phrase : " + phrase);
        System.out.println("Le premier mot : " + pZmot);
        System.out.println("Le nombre de mots : " + nbZmotCe);
        System.out.println("Le premier mot inversé : " + pMotI.toString());
    }
}
