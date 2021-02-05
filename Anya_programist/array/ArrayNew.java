package Anya_programist.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args){
        int[] a;
        Random rand = new Random();
        a = new int [rand.nextInt(20)];
        System.out.println("Длинна а = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}

