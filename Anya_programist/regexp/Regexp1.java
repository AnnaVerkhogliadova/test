package Anya_programist.regexp;

public class  Regexp1 {
    public static void main(String[] args){
        /*
        //d - одна цифра
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до

        (x|y|z) - одна строка из множества сторк

        [abcdef] - (a|b|c|d|e|f)
        [a-zA-Z] - все английские буквы
        [0-9] - \\d
        [^abc] - мы хотим все символы кроме (abc)
        */

        String a = "-4545";
        String b = "4545";
        String c = "+4545";

        //System.out.println(a.matches("(-|\\+)?\\d*"));
       // System.out.println(b.matches("(-|\\+)?\\d*"));
        //System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "s3";
        //System.out.println(d.matches("[a-zA-Z]+\\d*"));

        String e = "uio";
        System.out.println(e.matches("[^abc]*"));

        String url = "http//:www.google.com";
        System.out.println(url.matches("http//:www\\..+\\.(com|ru)"));

    }
}
