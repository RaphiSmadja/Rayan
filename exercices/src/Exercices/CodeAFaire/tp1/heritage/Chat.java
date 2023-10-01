package Exercices.CodeAFaire.tp1.heritage;

public class Chat extends Animal {
    public Chat(String nom, int age) {
        super(nom, age);
    }

    void miauler() {
        System.out.println(nom + " miaule.");
    }
}
