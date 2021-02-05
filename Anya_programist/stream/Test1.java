package Anya_programist.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String fileName = "C://Root/files/answer.txt";
        FileInputStream fis = new FileInputStream(fileName);
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
//чтение из файла


