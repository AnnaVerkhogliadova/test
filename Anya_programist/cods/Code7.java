package Anya_programist.cods;

public class Code7 {
    public static String abbrevName(String name) {
        String[] nam = name.split(" ");
        return (nam[0].substring(0, 1) + '.' + nam[1].substring(0,1));
    }
}
