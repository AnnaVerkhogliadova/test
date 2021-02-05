package Anya_programist.array;

import java.util.Arrays;
import java.util.Random;

public class Array2 {
        public static void main(String[] args) {
            Random rand  = new Random();
            int [] a = new int[5];
            int [] b = new int[5];
            int [] c = new int [10];

            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(50);
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = rand.nextInt(50);
            }
            for ( int i = 0; i < c.length; i++){
                if(i < c.length/2){
                    c[i]=a[i];
                } else{
                    c[i]=b[i-c.length/2];
                }
            }
            int e = new int [4][8].length;
            System.out.println(Arrays.toString(c));
            System.out.println(e);


        }
    }

