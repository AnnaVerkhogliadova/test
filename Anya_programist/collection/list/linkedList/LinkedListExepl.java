package Anya_programist.collection.list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class  LinkedListExepl {
    public static void main(String[] args) {
        String str1 = "Hello World!";
            String str2 = "My name is Earl";
            String str3 = "I love Java";
            String str4 = "I live in Moscow";

            List<String> earlBio = new LinkedList<>();
            earlBio.add(str1);
            earlBio.add(str2);
            earlBio.add(str3);
            earlBio.add(str4);

            System.out.println(earlBio);

        }
    }

