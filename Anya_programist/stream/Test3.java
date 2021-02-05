package Anya_programist.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("Root/files/reqest.txt");
        fos.write("GIVE ME THE CODE, PLEASE".getBytes());
        fos.close();
    }
}
