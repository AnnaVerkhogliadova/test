package Anya_programist.exceptions;

public class TryFinalyEx {
    public static void main(String[] args){
        try {
            try {
                throw new Exception("try");
            } finally {
                throw new Exception("finally");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
