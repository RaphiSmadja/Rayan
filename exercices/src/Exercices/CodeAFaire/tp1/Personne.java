package Exercices.CodeAFaire.tp1;

public class Personne {
    /*
    Exercice : Classe "Personne" en Java

Créez une classe Java nommée "Personne" avec les attributs suivants :

Nom (une chaîne de caractères)
Âge (un entier)
Sexe (une chaîne de caractères)
Ajoutez un constructeur à la classe "Personne" qui prend les trois attributs (nom, âge, sexe) en tant que paramètres et initialise les valeurs de l'objet.

Ajoutez une méthode "afficherDetails" à la classe "Personne" qui affiche les détails de la personne à l'écran (nom, âge, sexe).

Dans la méthode principale (public static void main), créez au moins deux objets "Personne" avec des valeurs différentes pour leurs attributs,
 puis appelez la méthode "afficherDetails" pour afficher leurs détails à l'écran.

     */

    private String nom;
    private int age;
    private String sexe;

    public Personne(String nom, int age, String sexe) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }

    public void afficherDetails() {
        System.out.println(nom + " - " + age + " - " + sexe);
    }


}
