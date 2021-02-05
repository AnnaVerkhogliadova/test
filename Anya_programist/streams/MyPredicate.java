package Anya_programist.streams;

import java.util.function.Predicate;

interface MyPredicate<T> {
    boolean test(T value);
}

class TestPredicate {
    public static void main(String[] args) throws Exception {
        MyPredicate<Integer> myPredicate = x -> (x > 0);
        System.out.println(myPredicate.test(1));   //true

        //Аналогично, но используется встроенный функциональный интерфейс java.util.function.Predicate
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(-1));    //false

        /*Функциональный интерфейс Predicate<T> проверяет соблюдение некоторого условия.
          Если оно соблюдается, то возвращается значение true.
          В качестве параметра лямбда-выражение принимает объект типа T*/
    }
}

