package Anya_programist.regexp;

import java.util.Arrays;

public class Regexp2 {
    public static void main(String[] args) {
        String a = "Hello123there123hey";
        String[] words = a.split("\\d*");
        System.out.println(Arrays.toString(words));

        String b = "Hello777there777hey";
        String modifiedString1 = b.replaceAll("\\d+", " ");
        String modifiedString2 = b.replaceFirst("\\d+", "-");

        System.out.println(modifiedString1);
        System.out.println(modifiedString2);

    }
}
