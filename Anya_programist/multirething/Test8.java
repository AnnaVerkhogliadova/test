package Anya_programist.multirething;

import java.util.LinkedList;
import java.util.Queue;

public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        ProduceAndConsume pc = new ProduceAndConsume();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class ProduceAndConsume {
    private Queue<Integer> q = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (q.size() == LIMIT) {
                    lock.wait();
                }
                q.offer(value++);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                while (q.size() == 0) {
                    lock.wait();
                }
                int value = q.poll();
                System.out.println(lock);
                lock.notify();
            }
        }
    }
}
