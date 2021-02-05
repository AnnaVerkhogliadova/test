package Anya_programist.exceptions;

import Anya_programist.collection.map.MapTest;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class ExceptionMap extends Exception {
}

class Map1 {
    public static void main(String[] args){
        Random rand = new Random(100);
        ArrayList<Integer> arr = new ArrayList<>(100);}}

//        for (int i = 0; i < 20; i++) {
//            arr.add(rand.nextInt(100));
//        }
//        arr.stream()
//                .map(a -> {
//                    try {
//                        mapTest(a);
//                    } catch (ExceptionMap ex){
//                        System.out.println("нечетное число");
//                    }
//                    return a;
//    \}
//    public static void mapTest(int a) throws ExceptionMap {
//        if(a % 2 != 0){
//            throw new ExceptionMap();
//        }
//    }