package Anya_programist.cycels;

public class WhileTest {
    static boolean condition() {
        double rand = Math.random();
        boolean result = rand < 0.99;
        System.out.println(rand);
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside while");

        System.out.println("Exited while");


    }
}