package Anya_programist.streams;

import java.util.function.Consumer;

public interface MyConsumer<T> {
    void accept (T t);
}

class TestConsumer {
    public static void main(String[] args) {
        MyConsumer<Integer> myConsumer = x-> System.out.printf("%d долларов \n", x);
        myConsumer.accept(600); // 600 долларов

        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов

        //Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая
    }
}
