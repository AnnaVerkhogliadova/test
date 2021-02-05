package Anya_programist.exceptions;

public class SimpleException extends Exception {}

class InheritingExceptions  {
    public void f() throws SimpleException {
        System.out.println("f()");
        throw new SimpleException();
    }
    public static void main(String[] args){
        InheritingExceptions ie = new InheritingExceptions();
        try {
            ie.f();
        } catch (SimpleException e){
            System.out.println("Перехвачено");
        }
    }
}
