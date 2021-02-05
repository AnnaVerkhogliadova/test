package Anya_programist.multirething;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleClock extends Thread {

}

class MainClock {
    public static void main(String[] args) throws InterruptedException {

        ConsoleClock cc = new ConsoleClock();
        cc.start();
        Thread.sleep(3000);
        cc.interrupt();

    }
}
