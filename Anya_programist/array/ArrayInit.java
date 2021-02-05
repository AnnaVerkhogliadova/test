package Anya_programist.array;

public class ArrayInit {
    public static void main(String[] args) {
        Other.main(new String[] {"a", "b", "c"});
    }
}
class Other {
    public static void main (String[] args){
        for (String s : args)
            System.out.println(s + " ");
    }
}