package Anya_programist.objectM;

public class ToString {
    String name;
    int age;
    int number;
    String adress;

    ToString(String name, int age, int number, String adress) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.adress = adress;
    }
    public String toString() {
        return name + " " + age + " " + number + " " + adress;
    }

    public static void main(String[] args){
        ToString tos = new ToString("Anna", 19, 1, "spb");
        System.out.println(tos);
        System.out.println(tos.toString());
    }
}
