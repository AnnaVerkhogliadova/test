package Anya_programist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Forr {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        for(int arr:list){
//            System.out.println(arr);
//        }
//
        try(Connection c = new Connection()){
            c.read();
        } catch (Exception e){

        } finally {
            System.out.println("i");
        }

    }

    static class Connection implements AutoCloseable{

        public void read(){
            System.out.println("read");
        }

        @Override
        public void close() throws Exception {
            System.out.println("close");
        }
    }
}


