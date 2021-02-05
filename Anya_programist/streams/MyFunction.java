package Anya_programist.streams;

import java.util.function.Function;

public interface MyFunction<T, R> {
    R apply(T t);
}

class TestFunction {
    public static void main(String[] args) {
        Function<Integer, String> function = x -> x + " долларов";
        System.out.println(function.apply(8));

        MyFunction<Integer, String> convert = x -> (x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов


        //Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R
    }
}
