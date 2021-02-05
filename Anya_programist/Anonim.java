package Anya_programist;

interface Anon {
    void sleep();
}
class Maps {
    public static void main(String[] args) {

        Anon anon1 = () -> System.out.println("Мониторинг общих показателей стартовал!");



         Anon anon2 = new Anon() {
            @Override
            public void sleep() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };

        Anon anon3 = new Anon() {
            @Override
            public void sleep() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };
        anon1.sleep();
        anon2.sleep();
        anon3.sleep();
    }
}
