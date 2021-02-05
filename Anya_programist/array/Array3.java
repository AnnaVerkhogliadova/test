package Anya_programist.array;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(10);
            }
        }
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for( int j = 0; j < a[i].length; j++){
                if (i == j || i+j==a.length-1) {
                    sum+=a[i][j];
                }
            }

        }



        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
