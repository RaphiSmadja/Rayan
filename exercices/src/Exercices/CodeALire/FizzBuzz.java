package Exercices.CodeALire;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}


// 1
// 2
// fizz
// 4
// buzz
// fizz
//7
// 8
// fizz
// buzz
