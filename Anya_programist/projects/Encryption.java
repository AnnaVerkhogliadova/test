package Anya_programist.projects;

import javax.xml.crypto.Data;
import java.util.Date;

public class Encryption {
    public static void main(String[] args) {
        Date date = new Date();
        String oldString = "anna";
        String newString = oldString.replace("a", "$");


        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);

        System.out.println(date);
    }
}


