package Exercices.CodeAFaire.tp1.Resto;

import java.util.Scanner;

/*
    Exercice : Gestionnaire de Restaurant
    Vous allez créer un programme Java qui simule la gestion d'un restaurant. Le programme permettra d'ajouter des plats au menu, de passer des commandes, d'afficher les commandes en cours, de calculer le total de la commande, et de quitter le programme.

    Fonctionnalités requises :
    Menu : Le programme doit permettre d'afficher le menu du restaurant, qui contient une liste de plats avec leur nom et leur prix.

    Ajout de plats au menu : L'utilisateur doit pouvoir ajouter de nouveaux plats au menu. Chaque plat doit avoir un nom et un prix.
    Commandes : L'utilisateur doit pouvoir passer des commandes en choisissant des plats du menu et en spécifiant la quantité souhaitée.

    Affichage des commandes en cours : Le programme doit afficher la liste des commandes en cours, en montrant le nom du plat et la quantité commandée.
    Calcul du total de la commande : Le programme doit être capable de calculer le montant total de la commande en fonction des plats commandés et de leur quantité.

Sortie du programme : L'utilisateur doit avoir la possibilité de quitter le programme.
     * Menu du Restaurant :
     * 1. Pizza - $10.99
     * 2. Hamburger - $7.99
     * 3. Salade César - $6.49
     *
     * Options :
     * 1. Ajouter un plat au menu
     * 2. Passer une commande
     * 3. Afficher les commandes en cours
     * 4. Calculer le total de la commande
     * 5. Quitter
     * Choisissez une option : 2
     *
     * Menu :
     * 1. Pizza - $10.99
     * 2. Hamburger - $7.99
     * 3. Salade César - $6.49
     * Entrez le numéro du plat à commander : 1
     * Entrez la quantité : 2
     * Commande passée.
     *
     * Options :
     * 1. Ajouter un plat au menu
     * 2. Passer une commande
     * 3. Afficher les commandes en cours
     * 4. Calculer le total de la commande
     * 5. Quitter
     * Choisissez une option : 3
     *
     * Commandes en cours :
     * 1. Pizza x2
     *
     * Options :
     * 1. Ajouter un plat au menu
     * 2. Passer une commande
     * 3. Afficher les commandes en cours
     * 4. Calculer le total de la commande
     * 5. Quitter
     * Choisissez une option : 4
     *
     * Total de la commande : $21.98
     *
     * Options :
     * 1. Ajouter un plat au menu
     * 2. Passer une commande
     * 3. Afficher les commandes en cours
     * 4. Calculer le total de la commande
     * 5. Quitter
     * Choisissez une option : 5
     *
     * Merci d'avoir utilisé notre service !
     */
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);
        boolean sortie = false;
        while (sortie == false) {
            System.out.println("Menu du restaurant : ");
            restaurant.afficherMenu();
            Main.afficherOptions();
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    // ajout plat
                    System.out.println("Entrez le nom du plat");
                    String nomPlat = scanner.next();
                    System.out.println("Entrez le prix du plat");
                    float price = scanner.nextFloat();
                    Plat plat = new Plat(4,nomPlat, price);
                    restaurant.ajoutPlatAuMenu(plat);
                    System.out.println("plat ajouté");
                    break;
                case 2:
                    // passer une commande
                    break;
                case 3:
                    //afficher
                    break;
                case 4:
                    //total
                    break;
                case 5:
                    sortie = true;
                    break;
                default:
                    System.out.println("Probleme de saisie");
            }

            Main.sautdeLigne();
        }
    }

    public static void afficherOptions() {
        System.out.println("\n\n" +
                "* Options :\n" +
                "     * 1. Ajouter un plat au menu\n" +
                "     * 2. Passer une commande\n" +
                "     * 3. Afficher les commandes en cours\n" +
                "     * 4. Calculer le total de la commande\n" +
                "     * 5. Quitter\n" +
                "     * Choisissez une option : ");
    }

    public static void sautdeLigne() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}
