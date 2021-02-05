package Anya_programist.cods;

public class Code5 {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int arg : args) {
            if (arg < min) {
                min = arg;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{-1, -10, 34, 8}));
    }
}
