package Exercices.CodeAFaire.tp1.heritage;

public class Chien extends Animal {
    public Chien(String nom, int age) {
        super(nom, age);
    }

    void aboyer() {
        System.out.println(nom + " aboie.");
    }
}
