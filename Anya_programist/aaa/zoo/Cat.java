package Anya_programist.aaa.zoo;

public class Cat extends Animal {
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am a Cat";
    }
}
