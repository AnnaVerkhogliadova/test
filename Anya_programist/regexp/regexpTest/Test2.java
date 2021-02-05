package Anya_programist.regexp.regexpTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String text = "Regular Expressions or Regex is an API for defining " +
                "String patterns that can be used for searching, manipulating and editing a text. " +
                "It is widely used to define a constraint on strings such as a password. " +
                "Regular Expressions are provided under java.util.regex package";

        Pattern p = Pattern.compile("\\ss\\w+s\\s");//[a-zA-Z]+(?m)[s]$");
        Matcher m = p.matcher(text);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
