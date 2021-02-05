package Anya_programist.exceptions;

public class MyExc  extends Exception {
    private String someString;

    public MyExc(String string){
        this.someString = string;
        System.out.println("MyExc");
    }

    public void myOwnExceptionMsg(){
        System.err.println("This is exception message for string: " + someString);
    }
}
class TestExc{
    public static void main(String[] args){
        try {
            String s = "SomeString";
            throw new MyExc(s);
        } catch (MyExc ex){
            ex.myOwnExceptionMsg();
        }
    }
}
