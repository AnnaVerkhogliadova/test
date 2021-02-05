package Anya_programist.libraries;

public class Calculator {
    double result = 5;

    public void getResult() {
        result = Math.pow(result, 2); //25
        result = result + 25; //50
        result = result / 3;
        result = Math.rint(result);
        System.out.println(result); //17
    }
}

class Main1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getResult();
    }
}