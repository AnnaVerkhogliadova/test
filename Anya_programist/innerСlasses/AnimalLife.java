package Anya_programist.innerСlasses;

public class AnimalLife {
    private String name;
    static String name1;

    void life() {
    }

    static void kiss() {
    }

    static void eat() {
        AnimalStatic animalStatic = new AnimalStatic();

        System.out.println("I am eating");
    }

    private void sleep() {
        System.out.println("I am sleep");
    }

    static class AnimalStatic {
        void run(String name){}
        AnimalLife al = new AnimalLife();
        public static void main(String[] args) {
            kiss();
            eat();
        }
    }
}
