package Anya_programist.cods;

public class Code6 {
    public static double find_average(int[] array) {
        double sum = 0;
        double a;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        a = sum/array.length;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{2,2,2,2,2}));
    }
}
