package Exercices.CodeALire;

import java.util.Scanner;

public class TextEnccryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le texte à crypter : ");
        String texte = scanner.nextLine();

        System.out.print("Entrez le nombre de pas : ");
        int pas = scanner.nextInt();

        String texteCrypte = crypterTexte(texte, pas);
        System.out.println("Texte crypté : " + texteCrypte);
    }

    public static String crypterTexte(String texte, int pas) {
        StringBuilder texteCrypte = new StringBuilder();

        for (int i = 0; i < texte.length(); i++) {
            char caractere = texte.charAt(i);

            if (Character.isLetter(caractere)) {
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                char caractereCrypte = (char) (base + (caractere - base + pas) % 26);
                texteCrypte.append(caractereCrypte);
            } else {
                texteCrypte.append(caractere);
            }
        }

        return texteCrypte.toString();
    }
}
