package Anya_programist.multirething;

public class Test11 extends Thread {
    String str;

    public Test11(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.print(str);
    }


    public static void main(String[] args) {
        Test11 t1 = new Test11("Thread1");
        Test11 t2 = new Test11("Thread2");
        Test11 t3 = new Test11("Thread3");
        t1.start();
        //t3.run(); // 1{
    }
}
