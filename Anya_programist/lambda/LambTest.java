package Anya_programist.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(i+1);
        }
        list = list.stream().filter(a -> a%3 == 0).map(a -> a*2).limit(2).collect(Collectors.toList());
        System.out.println(list);
    }
}