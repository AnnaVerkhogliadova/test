package Anya_programist.modificators;

class Private {
    private int age;
    private String name;

    public void methood(){
        System.out.println("hello");
    }
    Private (int age, String name){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

 public class PrivatTest {
    public static void main(String[] args) {
        Private pr = new Private(20,"anna");
        pr.methood();
        pr.getName();
        pr.getAge();


    }
 }


