package Anya_programist.regexp;

import Anya_programist.collection.PatternTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp3Patern {
    public static void main(String[] args){
        String text = "Hello, my name is Anna, i love dogs and cinema\n" +
                "my favorite musical group is My chemical romance, it is mail is MyChRo@gmail.com\n" +
                "my address: verh2511@icloud.com";
        Pattern email = Pattern.compile("(\\w+)@(icloud|yandex|gmail)+\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}
