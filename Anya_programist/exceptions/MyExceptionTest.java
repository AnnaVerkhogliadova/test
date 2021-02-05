package Anya_programist.exceptions;


public class MyExceptionTest {

    public static void fib(int limit, int a, int b) throws MyExcetionn {


        if (a<1 || b<1) throw new MyExcetionn("The number is less than 1", a, b);
        if (b > limit) {
            return;
        }
        b = a + b;
        a = b - a;
    }
}

class MyExcetionn extends Exception{

    private int number;
    public int getNumber(){return number;}
    public MyExcetionn (String message, int a, int b){

        super(message);
    }
}
class Main {

}

