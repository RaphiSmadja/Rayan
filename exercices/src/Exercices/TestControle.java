package Exercices;

public class TestControle {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 5;

        boolean condition1 = (x > 5) && (y < 30);
        boolean condition2 = (y >= 20) || (z < 3);

        if (condition1 && condition2) {
            System.out.println("Les 2 conditions sont vraies");
        } else if (condition1 || condition2) {
            System.out.println("Au moins l'une des conditions est vraie");
        } else {
            System.out.println("Aucune condition est vraie");
        }
        System.out.println(Math.sqrt(5));
    }
}
