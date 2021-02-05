package Anya_programist.array;

public class MaxArray {
    public static void main(String[] args) {
        Integer sum = 0;
        Integer sum2 = 0;
        Integer[] a = {5, 6, 8, 4, 1, 9, 0, 3, 2};
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < 10; i++) {
            sum2 += i;
        }
        System.out.println(sum2 - sum);

        Integer[] b = {5, 6, 8, 4, 1, 9, 0, 3, 2};
        for (int i = 0; i < b.length; i++) {
            for (int j = b.length - 1; j > i; j--) {
                if (b[j] < b[j - 1]) {
                    Integer per = b[j - 1];
                    b[j - 1] = b[j];
                    b[j] = per;
                }
            }
        }
        for(int i = 0; i < b.length-1; i++) {
            if(b[i]+1 != b[i+1]) {
                System.out.println(b[i]+1);
                break;
            }
        }
    }
}
