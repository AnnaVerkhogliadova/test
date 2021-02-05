package Anya_programist.cods;

import java.util.Random;

public class Code12 {

    public static int GetSum(int a, int b)
    {
        int sum =0;
        if(a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        //Good luck
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(-1,0));
    }
}
