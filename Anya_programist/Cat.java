package Anya_programist;

public class Cat {
    void print() {
        System.out.println("print");
    }
}

class Cat2 {
    private final Cat cat;
    Cat2(Cat cat) {
        this.cat = cat;
    }

    void print() {
        for (int i = 0; i < 10; i++) {
            cat.print();
        }
    }
}

class Cat3 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cat2 c2 = new Cat2(c);
        c2.print();

    }

}