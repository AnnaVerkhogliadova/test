package Anya_programist.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTestMethods {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map1.put(1, "Кошка");
        map1.put(2, "Собака");
        map1.put(3, "Черепаха");

        map2.put(4, "Попугай");
        map2.put(5, "Ящерица");

        map1.putAll(map2);
        System.out.println(map1);

        Set<Integer> keys = map1.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(map1.values());
        System.out.println("Значения: " + values);


        //map.clear();
        if (!map1.isEmpty()) {
            System.out.println(map1);
        }

        for (Map.Entry entry : map1.entrySet()) {
            System.out.println(entry);
        }
    }
}
