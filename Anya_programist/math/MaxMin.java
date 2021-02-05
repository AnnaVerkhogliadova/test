package Anya_programist.math;


public class MaxMin {
    public static void main(String[] args) {
        int a = 100;
        double[] list = new double[a];
        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random();
        }
        for (double i : list) {
            System.out.println(i);
        }
    }
}
