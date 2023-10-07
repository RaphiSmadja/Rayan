package TpExo.fonctions;

import java.util.Scanner;

public class Exo1 {

    /*
    Calcul du PGCD (Plus Grand Commun Diviseur) : Écrivez une fonction qui prend deux entiers positifs en entrée et renvoie leur PGCD en utilisant l'algorithme d'Euclide. Appelez cette fonction pgcd.

Vérification de nombre premier : Écrivez une fonction qui prend un entier positif en entrée et renvoie true s'il s'agit d'un nombre premier, sinon false. Appelez cette fonction estNombrePremier.

Calcul de la somme des chiffres : Écrivez une fonction qui prend un entier en entrée et renvoie la somme de ses chiffres. Par exemple, si l'entrée est 123, la fonction doit renvoyer 6. Appelez cette fonction sommeDesChiffres.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir A : ");
        int nbA = scanner.nextInt();
        System.out.println("Saisir B : ");
        int nbB = scanner.nextInt();
        euclyde(nbA, nbB);
    }

    public static void euclyde(int nb1, int nb2) {
        int reste = -1;
        if (nb2 > nb1) {
            int tmp = nb2;
            nb2 = nb1;
            nb1 = tmp;
        }
        while (reste != 0) {
            reste = nb1 % nb2;
            nb1 = nb2;
            nb2 = reste;
        }
        System.out.println("Le résultat est " + nb1);
    }
}
