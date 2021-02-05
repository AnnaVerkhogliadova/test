package Anya_programist.array;

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(10, 3.14, 11.11);
        printArray("раз", "два", "три");
        printArray((Object[]) new Integer[]{1, 2, 3});
        printArray();

    }
}
