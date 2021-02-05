package Anya_programist.cods;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code8 {

    public boolean check(String sentence){
        Set<String> set = new HashSet<>();

        for(char s : sentence.toCharArray()){
            String newS = "" + s;
            if(newS.matches("[a-zA-Z]")){
                set.add(newS.toLowerCase());
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        Code8 code8 = new Code8();
        System.out.println(code8.check("The quick brown fox jumps over the lazy dog"));

    }
}
