package Anya_programist;

import java.util.Scanner;

public class Human {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = s1.nextLine();
        System.out.println("Введите возраст");
        int age = s1.nextInt();
       Humans human1 = new Humans(name,age);
        System.out.println(human1);


    }
}
 class Humans {
    private final String name;
    private final int age;

    public Humans(String name, int age) {
//        if (name.isBlank()) {
//            throw new RuntimeException("Не бывает пустого имени");
//        } else if (age < 0 || age > 120){
//            throw new RuntimeException("Не бывает такого возраста");
//
//        }
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return "Имя: " + name + " Возраст: " + age;
    }

 }