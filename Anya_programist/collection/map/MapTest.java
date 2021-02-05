package Anya_programist.collection.map;

import java.util.*;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();                // не гарантируеся упорядочность
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();// в каком порядке добавлены и таком и будут выведены
        Map<Integer, String> treeMap = new TreeMap<>();// сортируется по ключу (естественный порядок)
        Set<Integer> set = new HashSet<>();

        System.out.println(hashMap.get(1));

        MapTest(hashMap);
        System.out.println("");
        MapTest(linkedHashMap);
        System.out.println("");
        MapTest(treeMap);
    }

    public static void MapTest(Map<Integer, String> map) {
        map.put(6, "Anna");
        map.put(89, "Denis");
        map.put(58, "Natasha");
        map.put(1, "Dasha");
        map.put(14, "Julia");
        map.put(112, "Katya");




        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

