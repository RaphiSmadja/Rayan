package Exercices.CodeAFaire.tp1;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Raphael", 28,"Homme");
        Personne personne2 = new Personne("Rayan", 22,"Homme");

        personne1.afficherDetails();
        personne2.afficherDetails();
    }
}
