package Anya_programist.finall;

public class FinalC {
    final static String FINAL_EXAMPLE_NAME = "I'm likely final one";

    //final переменная, которая не инициализирована, но работать будет только если
    //инициализировать это в конструкторе:
    final long creationTime;

    public FinalC() {
        this.creationTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        FinalC finalExample = new FinalC();
        System.out.println(finalExample.creationTime);
        System.out.println(FINAL_EXAMPLE_NAME);
    }
}
