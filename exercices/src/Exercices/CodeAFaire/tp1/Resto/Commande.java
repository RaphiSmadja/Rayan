package Exercices.CodeAFaire.tp1.Resto;

public class Commande {
    private Plat plat;
    private int quantite;

    public Commande(Plat plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
    }

    public void afficherCommande() {
        System.out.println(plat.getIndex() +". " + plat.getNom() + " x" + quantite);
    }

    public void calculerPrixCommande() {
        System.out.println("Total de la commande : $" +plat.getPrix() * quantite);
    }
}
