package Anya_programist.multirething;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
       myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread.start();
        Thread thread = new Thread(new Runner());

        thread.start();
        System.out.println("Hello from main thread");
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my Thread №" + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my Thread" + i);
        }
    }
}