package Anya_programist.objectM;

public class HashCode {
    public static void main(String[] args) {
        Annn a1 = new Annn(6,8);
        Annn a2 = new Annn(5,8);
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

    }
}

class Annn {
    int a;
    int b;

    public boolean equals(Annn annn) {
        return this.a == annn.a;
    }

    Annn(int a, int b) {
        this.a = a;
        this.b = b;
    }

}


