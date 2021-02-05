package Anya_programist.exceptions;

import java.io.*;

public class FileTest extends Exception {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Anya\\IdeaProjects\\anna\\src\\Anya_programist\\exceptions\\AnnaVerh");
//            System.out.println(new String(fis.readAllBytes()));
        } catch (FileNotFoundException e){
            System.out.println("НЕ найдено!");
        } catch (IOException a) {
            a.printStackTrace();
        }
    }
}

