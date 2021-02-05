package Anya_programist.functionInterfece;


@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}


class LambdaApp {

    public static void main(String[] args) {

        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}