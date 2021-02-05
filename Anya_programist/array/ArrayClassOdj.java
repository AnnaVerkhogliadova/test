package Anya_programist.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassOdj {
    public static void main(String[] args) {
        Random rand  = new Random();
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("Длинна а = " + a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500);
        System.out.print(Arrays.toString(a));

    }
}
