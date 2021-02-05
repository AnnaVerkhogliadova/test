package Anya_programist.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Annnnna");

        list.sort((s1, s2) -> {
            if (s1.length() > s2.length())
                return 1;
            else if (s1.length() < s2.length())
                return -1;
            else return 0;
        });
        System.out.println(list);
    }
}
