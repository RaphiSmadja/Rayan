package Exercices.CodeAFaire;

import java.util.Arrays;

public class TriABulle {


    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2, 7, 6, 9, 8};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) { // 5 et 1
                    int tmp = array[j]; // 1
                    array[j] = array[i]; // 5
                    array[i] = tmp; // 1
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
