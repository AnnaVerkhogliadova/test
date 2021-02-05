package Anya_programist.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedC <T> {
    public static void main(String[] args) {
        String str = "one";
        String str1 = "one";
        String str2 = new String("one");
        System.out.println(str2.intern()==str1);
        System.out.println(str.hashCode()==str1.hashCode());




    }

    public <T extends List> void g(List<T> list){

    }
}
