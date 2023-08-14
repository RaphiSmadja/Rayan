package Exercices.CodeALire;

public class Multiply {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int product = 1;
        for (int value : values) {
            product *= value; // product = product * value
        }
        System.out.println(product);
    }
}
