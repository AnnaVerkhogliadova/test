package Anya_programist.multirething;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread2.shutdown();

    }
}
class MyThread2 extends Thread {
    private volatile boolean running = true;

    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
