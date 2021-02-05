package Anya_programist;

public class Rock {

    private static Object m1;
    private final int ml;
    private final int m2;

    public Rock(int pop) {
        ml = pop;
        m2 = pop;
    }

    public Rock(int m1, int m2) {
        this.ml = m1;
        this.m2 = m2;
    }

    public int getMl() {
        return ml;
    }

    public int getM2() {
        return m2;
    }


    public static void main(String[] args) {
        Rock mR1 = new Rock(5);
        Rock mR2 = new Rock(6, 6);
        System.out.println(mR1.getMl());
        System.out.println(mR1.getM2());
        System.out.println(mR2.getMl());
        System.out.println(mR2.getM2());
    }


}