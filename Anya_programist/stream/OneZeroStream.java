package Anya_programist.stream;

import java.io.InputStream;
import java.util.Scanner;

public class OneZeroStream extends InputStream {
    byte[] arr = {'1',' ', '0',' ', '1',' ', '0', ' ','1', ' ','0', ' ','1', ' ','0', ' ','1',' ', '0'};
    int i = 0;

    public int read() {
        if(i == arr.length){
            return -1;
        }
        return arr[i++];
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++) {
            System.out.print(scanner.nextInt());
        }
    }
}

/*
The code above has to output
1010101010
*/
