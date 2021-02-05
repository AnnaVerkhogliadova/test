package Anya_programist.collection.generic;

import java.util.List;

public class Crate4 {
    public static void addToList(List<? super Parent> list) { // 1
        list.add(new Child()); // 2
        System.out.println("Успешно Добавили в лист");
    }
}

class Parent {}
class Child extends Parent {}

//нижняя граница