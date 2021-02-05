package Anya_programist.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(i);
        }
        Integer sumOddOld = 0;
        for(Integer i: list) {
            if(i % 2 != 0) {
                sumOddOld += i;
            }
        }
        System.out.println(sumOddOld);
        //list.stream().filter(a -> a%5 == 0).reduce((s1, s2) -> s1 + s2);
        System.out.println(list.stream().filter(a -> a%5 == 0).reduce((s1, s2) -> s1 + s2));
        //list.stream().filter(a -> a < 20).map(a -> a +10).map(a -> a + "-").forEach(System.out::println);
    }
}
