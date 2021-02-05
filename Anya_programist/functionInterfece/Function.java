package Anya_programist.functionInterfece;

public interface Function <T, R> {
    R apply(T t);
}

class LambdaApp3 {
    public static void main(String[] args) {
        Function <Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5));
    }
}
