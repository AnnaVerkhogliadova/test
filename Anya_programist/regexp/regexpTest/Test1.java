package Anya_programist.regexp.regexpTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String text = "*-ки *должны* примыкать к *СЛОВУ*";

        Pattern p = Pattern.compile("(\\*)[а-яА-Я]+(\\*)");
        Matcher m = p.matcher(text);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}

/*Напишите регулярку, которая найдет
в строке aba aba a!a abba adca abea
строки abba adca abea по шаблону: буква a, 2 любых символа, буква a.*/
