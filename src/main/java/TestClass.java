import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        TestClass.scanner();
    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        Integer result = null;
        while(true) {
            int operand1;
            if (result == null){
                System.out.println("Введите свой пример");
                operand1 = scanner.nextInt();
            } else {
                operand1 = result;
            }
            System.out.println("Введите операцию вычисления или 'С' если хотите начать с начала");
            char operation = scanner.next().charAt(0);
            if (operation == 'c' || operation == 'C' || operation == 'с' || operation == 'С'){
                result = null;
                continue;
            } else if (operation == 's'){
                break; 
            }
            int operand2 = scanner.nextInt();

            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    while (operand2 == 0) {
                        System.out.println("На ноль делить нельзя, введите новое значение");
                        operand2 = scanner.nextInt();
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Неверная операция");
            }
            System.out.println(result);
        }
    }
}


