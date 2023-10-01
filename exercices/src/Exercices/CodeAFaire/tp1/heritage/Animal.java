package Exercices.CodeAFaire.tp1.heritage;

public class Animal {
    protected String nom;
    public int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    void manger() {
        System.out.println(nom + " mange.");
    }

    void dormir() {
        System.out.println(nom + " dort.");
    }
}
