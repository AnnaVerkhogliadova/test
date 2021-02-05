package Anya_programist.multirething;

class CheckResults {
    public static int counter = 0;


    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            public void run(){
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                }
            }
        }.start();
        while (CheckResults.counter < 500) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 секунда
        }
        System.out.println("Reached");
    }
}

public class EchoServer {

    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            public void run(){
                for (int i = 0; i < 1000000000; i++) {
                    CheckResults.counter++;
                }
            }
        };

        thread.start();
        thread.join(); // main() поток блокируется и ждет, пока не завершится поток thread
        System.out.println("Counter value: " + counter); // Counter value: 1000000
    }

}


