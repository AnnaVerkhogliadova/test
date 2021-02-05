package Anya_programist.cycels;

public class   WhileTestSecond {
    public static void main (String [] args) {
        int a = 0;
        while (a<1000000) {
            if (a == 2000) {
                break;
            }
            a++;
        }
        int b = 0;
        do {
            b++;
            if (b%3 == 0) {
                continue;
            }
            System.out.println(b);
        }
        while (b<3000);
    }
}