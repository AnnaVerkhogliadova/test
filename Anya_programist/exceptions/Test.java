package Anya_programist.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            readFromFile();
        } catch (IOException /*| FileNotFoundException*/ e) {
            e.printStackTrace();
        }
        System.out.print("Done");
    }

    public static void readFromFile() throws IOException {
        System.out.print("Reading line ");
    }
}
