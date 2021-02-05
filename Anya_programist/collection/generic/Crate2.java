package Anya_programist.collection.generic;

import java.util.LinkedList;
import java.util.Queue;

class Crate2 {
    public static <T extends Number> void ship(T number) {
        double value = number.doubleValue();
        int a = number.intValue();
        System.out.println("Preparing " + value);
    }


}

//верхняя граница типа — Upper Bound