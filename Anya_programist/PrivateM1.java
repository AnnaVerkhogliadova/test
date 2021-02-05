package Anya_programist;

public class PrivateM1 {
    static public String a = "public String M1";
    static private String b = "private String M1";

    static public String getA() {
        System.out.println("getA");
        return a;
    }

    static public void method1() {
        System.out.println("method1 M1");
    }

    static {
        System.out.println("static");
    }

    public PrivateM1() {
        System.out.println("constructor");
    }
}

class PrivateM2 extends PrivateM1 {
    public static void main(String[] args) {
        System.out.println("M2");
        getA();

    }
}
