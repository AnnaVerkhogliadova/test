package Anya_programist.math;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fac(4));
    }
    public static long fac(long n) {
        if (n == 1)
            return 1;
        return n * fac(n-1l);
    }
}
