package Anya_programist.collection.generic;

import java.util.LinkedList;
import java.util.Queue;

public class Crate3 {
    public static void main(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("Java");
        printList(keywords);
        System.out.println(63%8);
    }

    private static void printList(Queue<? extends Object> keywords) {
        for (Object o : keywords) {
            System.out.println(55%8 == 0);
        }

    }
}

//Wildcard
