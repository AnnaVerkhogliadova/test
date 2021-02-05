package Anya_programist.multirething;



public class TestStart extends Thread {
    int i;

    public TestStart(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.print(i);
    }
}


class Main implements Runnable{
    public void run() {
        System.out.print("A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("B");
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Main()).run();
        new Thread(new Main()).run();
    }
}

/*class Advertisement {
    static void show(){}
}*/
