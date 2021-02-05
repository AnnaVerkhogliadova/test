package Anya_programist;

public class Electrocar {
    private int id;


    private class Motor {
        private int age;
        public void startMotor() {
            Battery battery1 = new Battery();
            System.out.println("Motor" + id + "is starting...");
        }
    }

    private static class Battery {
        private int age;
        public void charge() {
            Electrocar electrocar1 = new Electrocar(3);
            electrocar1.id = 5;
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        motor.age = 9;

        Battery battery1 = new Battery();
        battery1.age = 6;
        final int x = 1;

        class SomeClass{
            void someMethood() {
                Motor motor  = new Motor();
                motor.age = 5;
                Battery battery = new Battery();
                battery.age = 6;
                System.out.println(x);
                System.out.println(id);
            }
        }
        System.out.println("Elecrocar " + id + "is starting...");
    }
}

class ElectrocarTest {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
    }
}
