package Anya_programist.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ArithmeticException {

}

class A{
    public void f() throws IOException {
        System.out.println("Hello");
    }
}
class B extends A{
    @Override
    public void f() throws IOException {
        super.f();
    }

    public static void main(String[] args) throws IOException{
        B b = new B();
        b.f();
    }
}
