package Exercices.CodeAFaire.tp1.Resto;

public class Plat {
    // attributs
    private String nom;
    private float prix;

    // constructeur
    public Plat(String nom, float prix) {
        // instancier les attributs
        this.nom = nom;
        this.prix = prix;
    }

    // accesseur et muttateur (getter et setter)

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

}
