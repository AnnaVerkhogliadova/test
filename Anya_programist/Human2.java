package Anya_programist;



public class Human2 {
    public static void main(String[] args) {
      Humans2 h2 = new Humans2(20, "Anna");
        System.out.println(h2);
        h2.met();

    }
}
class Humans2 {
    static void met(){
        System.out.println("статический метод");
    }
    private int age;
    private String name;

    Humans2 (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name + age;
    }
}
