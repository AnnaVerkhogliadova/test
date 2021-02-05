package Anya_programist.functionInterfece;

public interface Predicate<T> {
    boolean test (T t);
}

class LambdaApp2 {
    public static void main(String[] args) {
        Predicate <Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));
    }
}
