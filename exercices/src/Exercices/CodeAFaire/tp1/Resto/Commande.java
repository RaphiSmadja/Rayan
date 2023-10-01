package Exercices.CodeAFaire.tp1.Resto;

public class Commande {
    private Plat plat;
    private int quantite;

    public Commande(Plat plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
    }

    public void calculerPrixCommande() {
        System.out.println("Total de la commande : $" +plat.getPrix() * quantite);
    }

    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
