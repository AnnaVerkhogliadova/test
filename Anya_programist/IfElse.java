package Anya_programist;

public class IfElse {
    static int result = 0;

    static void test(int t1, int t2) {
        if (t1 > t2)
            result = +1;
        else if (t1 < t2)
            result = -1;
        else
            result = 0;
    }
    public static void main (String [] args) {
        test(10,5);
        System.out.println(result);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);
    }
}
