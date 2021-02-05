package Anya_programist.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTest {
    public Integer[] array1(int a) {
        Random rand = new Random();
        Integer[] arr = new Integer[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50);
        }
        return arr;
    }
    public ArrayList array2(Integer[] a) {
        ArrayList<Integer> aL = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            aL.add(a[i]);
        }
        return aL;
    }
    public static void main (String[] args) {
        CollectionTest ct = new CollectionTest();
        Integer[] a = ct.array1(5);
        List<Integer> b = ct.array2(a);
        for(Integer i : b) {
            System.out.println(i);
        }
    }
}

