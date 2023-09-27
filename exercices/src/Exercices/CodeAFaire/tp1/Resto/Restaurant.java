package Exercices.CodeAFaire.tp1.Resto;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Plat> menu = new ArrayList<>();
    private List<Commande> commandes = new ArrayList<>();

    public Restaurant() {
        Plat plat1 = new Plat(1, "Pizza", 10.99f);
        Plat plat2 = new Plat(2, "Hamburger", 12.50f);
        Plat plat3 = new Plat(3, "Salade", 7.99f);
        ajoutPlatAuMenu(plat1);
        ajoutPlatAuMenu(plat2);
        ajoutPlatAuMenu(plat3);
    }

    public void afficherMenu() {
        for (Plat plat : menu) {
            System.out.println(plat.getIndex() + ". " + plat.getNom() + " - $" + plat.getPrix());
        }
    }

    public List<Plat> getMenu() {
        return menu;
    }

    public void setMenu(List<Plat> menu) {
        this.menu = menu;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public void ajoutPlatAuMenu(Plat plat) {
        this.menu.add(plat);
    }
}
