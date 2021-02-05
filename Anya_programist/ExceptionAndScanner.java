package Anya_programist;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionAndScanner {
    public static void main(String[] args) {
        try{
            m();
        } catch (IOException e){

        }
    }

    public static void m() throws IOException{
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new IOException();
            }
        }
    }
}

class AA {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                int x = Integer.parseInt(scanner.nextLine());
                if (x > 10) {
                    throw new IOException("нужно число меньше 10");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
