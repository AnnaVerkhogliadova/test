package Anya_programist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sream {
    public static void main(String[] args){
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Stream stream = list.stream();
        System.out.println(stream);

    }
}
