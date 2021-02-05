package Anya_programist;

class Animal {
    public int a = 1;

    void voise() {
        System.out.println("Метод 1" + a);
    }

    static void run(int a) {
        System.out.println("Метод 2");
    }
}

public class Dog extends Animal {
    public int a = 2;
    @Override
    void voise() {
        System.out.println("Переопределенный метод 1");
    }
    static void run(int a) {
        System.out.println("Переопределение метода 2");

    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.voise();
        animal.run(58);
        System.out.println(animal.a);
    }
}
