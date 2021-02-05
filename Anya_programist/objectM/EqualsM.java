package Anya_programist.objectM;

public class EqualsM {
    String modelCar;
    int maxSpeed;


   public boolean equals(EqualsM equalsM) {
       return this.modelCar == equalsM.modelCar;
    }

    public static void main(String[] args) {
        EqualsM car1 = new EqualsM();
        car1.modelCar = "Ferrari";
        car1.maxSpeed = 300;

        EqualsM car2 = new EqualsM();
        car2.modelCar = "Ferrari";
        car2.maxSpeed = 300;

        String s1 = "Java!";
        String s2 = "Java!";

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car1.equals(car2));
        System.out.println(s1 == s2.intern());

    }
}
