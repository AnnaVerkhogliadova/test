package Anya_programist.math;

public class Fibonachi {
    public static void main(String[] args) {
        fib(99, 0, 1);
    }

    public static void fib(int limit, int a, int b) {
        if (b > limit) {
            return;
        }
        b = a + b;
        a = b - a;

        System.out.println(b);
        fib(limit, a, b);


    }
}
