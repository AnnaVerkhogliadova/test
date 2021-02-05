package Anya_programist.sort;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
//        int[] array = {2, 200, 52, 31, 505};
//        sortBarrels(array);
//        findMinMax(array);
         int[][] matrix = new int[5][5];
        fillDiagonals(matrix);



    }

    public static void sortBarrels(int[] array) {
        int wineCount = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                wineCount++;
            }
        }
        int wineArray[] = new int[wineCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                wineArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(wineArray));
    }

    public static void findMinMax(int[] array) {
        int min = array[0], max = array[0];
        for (int i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Min: " + min + " Max: " + max);
        System.out.println();
        ;
    }

    public static void fillDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
