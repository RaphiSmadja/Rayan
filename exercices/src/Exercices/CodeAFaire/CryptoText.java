package Exercices.CodeAFaire;

import java.util.Scanner;

public class CryptoText {

    public static void main(String[] args) {
        System.out.println("Entrez un message");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        System.out.println("Entrez un nombre de pas");
        int pas = scanner.nextInt();

        String messageCrypte = "";
        for (int i = 0; i < message.length(); i++) {
            char lettre = (char) (122 - (message.charAt(i) + pas % 26));
            messageCrypte += lettre;
        }
        System.out.println(messageCrypte);
    }
}
