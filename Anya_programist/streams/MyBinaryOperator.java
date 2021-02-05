package Anya_programist.streams;

import java.util.function.BinaryOperator;

public interface MyBinaryOperator<T> {
    T apply(T t1, T t2);
}

class BinaryOperatorTest {

    public static void main(String[] args) {

        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20

        MyBinaryOperator<Integer> myBinaryOperator = (x, y) -> x * y;
        System.out.println(myBinaryOperator.apply(8,9));

        /*BinaryOperator<T> принимает в качестве параметра два объекта типа T,
          выполняет над ними бинарную операцию и возвращает
          ее результат также в виде объекта типа T*/
    }
}