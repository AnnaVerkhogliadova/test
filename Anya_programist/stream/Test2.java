package Anya_programist.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        String fileName = "Root/files/asciitable.txt";
        FileInputStream fis = new FileInputStream(fileName);
        int i;
        int c = 0;
        while ((i = fis.read()) != -1) {
            if (i >= '0' && i <= '9') {
                c++;
            }
            System.out.print(c);
        }
        fis.close();
    }
}

