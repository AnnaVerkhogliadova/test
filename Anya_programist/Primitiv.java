package Anya_programist;

interface A {
    void eat();
}

public class Primitiv {
    private final A a;

    public Primitiv() {
        a = new A() {
            public void eat() {

            }
        };
    }

    public static void m(A a) {
        a.eat();
    }

    public static void main(String[] args) {
        C c = new C();
        B b = c;
        System.out.println(c.getG());
        System.out.println(b.getG());
    }
}

class B implements A {
    public int g = 3;

    public void eat() {
        System.out.println("b");
    }

    public void sleep() {
        System.out.println("b");
    }

    public int getG() {
        return g;
    }
}

class C extends B {
    public int g = 5;

    public void eat() {
        System.out.println("c");
    }

    public void drunk() {
    }

    public void sleep() {
        System.out.println("c");
    }

    public int getG() {
        return g;
    }
}

