package Anya_programist.cods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code10 {
    public static String[] dirReduc(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        map.put("SOUTH", 0);
        map.put("NORTH", 0);
        map.put("EAST", 0);
        map.put("WEST", 0);
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }

        }
        int sCount = map.get("SOUTH");
        int nCount = map.get("NORTH");
        int eCount = map.get("EAST");
        int wCount = map.get("WEST");

        List<String> sList = new ArrayList<>();
        int sMinusN = sCount - nCount;
        int wMinusE = wCount - eCount;
        if (sMinusN < 0) {
            sList.add("NORTH");
        } else if (sMinusN > 0) {
            sList.add("SOUTH");
        }
        if (wMinusE < 0) {
            sList.add("EAST");
        } else if (wMinusE > 0) {
            sList.add("WEST");
        } 
        return (String[]) sList.toArray();
    }

    public static void main(String[] args) {
        dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
    }
}

