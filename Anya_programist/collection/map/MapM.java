package Anya_programist.collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapM {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(1, "кошка");
        passportsAndNames.put(2, "собака");
        passportsAndNames.put(3, "птица");

        String a = passportsAndNames.get(1);            //получает ключ
        passportsAndNames.remove(3);               //удаляет ключ
        boolean b = passportsAndNames.containsKey(4);   //проверяет наличие ключа

        Set<Integer> keys = passportsAndNames.keySet(); //получение ключей по отдельности
        System.out.println("Ключи: " + keys);

        System.out.println(passportsAndNames.size());   //возвращает размер

        if (!passportsAndNames.isEmpty()) {

            System.out.println(passportsAndNames);
        }

        System.out.println(passportsAndNames);
        System.out.println(a);
        System.out.println(b);

    }
}
