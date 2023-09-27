package Exercices.CodeAFaire.tp1.Resto;

public class Plat {
    // attributs
    private int index;
    private String nom;
    private float prix;

    // constructeur
    public Plat(int index, String nom, float prix) {
        // instancier les attributs
        this.nom = nom;
        this.index = index;
        this.prix = prix;
    }

    public void afficherPlat(int index) {
        System.out.println(index + ". " + nom + " - $" + prix);
    }

    // accesseur et muttateur (getter et setter)

   public int getIndex() {
        return index;
   }

   public void setIndex(int index) {
        this.index = index;
   }

   public String getNom() {
        return nom;
   }

   public float getPrix() {
        return prix;
   }

}
