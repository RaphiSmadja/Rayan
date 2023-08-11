public class Main {
    public static void main(String[] args) {
        // si la personne est majeure on la laisse entrer
        // age majeur
        // age < 50 ans
        int age = 50;
        Main.openOrClosed(age);

    }

    public static void openOrClosed(int age) {
        //1ERE SOLUTION
        if (age < 18) {
            System.out.println("Vous pouvez pas entrer vous etes mineur");
        } else if (age >= 50) {
            System.out.println("Vous pouvez pas entrer");
        } else {
            System.out.println("Vous pouvez entrer");
        }

        //2EME SOLUTION
        if (age<18 || age>=50) {
            System.out.println("Vous pouvez pas entrer");
        } else {
            System.out.println("Vous pouvez entrer");
        }
    }
}
