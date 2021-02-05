package Anya_programist.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();

        string.add("cat");
        string.add("dog");
        string.add("frog");
        string.add("bird");
        string.add("apple");
        string.add("ab");


        List<Integer> ints = new ArrayList<>();

        ints.add(2);
        ints.add(15);
        ints.add(258);
        ints.add(0);
        ints.add(-251);

        Collections.sort(string, new StringLengthComparator());
        System.out.println(string);

        Collections.sort(ints, new BackwordsIntegerComparator());
        System.out.println(ints);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwordsIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
