package Anya_programist.exceptions;

import java.io.Closeable;

public class A5 implements Closeable {


    @Override
    public void close() {
        throw new RuntimeException("1");


    }
}

class B5 {
    

    static void met() {
        byte a = 127;
        a++;
        System.out.println(a);
    }


    public static void main(String[] args) {
        met();
        //staticM();
    }


    public static void staticM() {
        try (A5 a5 = new A5()) {
            throw new RuntimeException("2");
        }
    }

}