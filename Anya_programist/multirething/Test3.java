package Anya_programist.multirething;

public class  Test3 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test3 test3 = new Test3();
        test3.doWork();
    }
    public void increment(){
        synchronized (this) {
            counter++;
        }
    }

    public void doWork() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(counter);
    }

}

