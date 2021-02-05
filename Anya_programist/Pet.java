package Anya_programist;

import java.util.Objects;

public class Pet {
    public int age;
    public float weight;
    public float height;
    public char c;
    public String color;

    public void sleep() {
        System.out.println("Спокойной ночи");
    }

    public void eat() {
        System.out.println("Хочу есть");
    }

    public String say(String aWold) {
        return "я тебя люблю" + aWold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Float.compare(pet.weight, weight) == 0 &&
                Float.compare(pet.height, height) == 0 &&
                Objects.equals(color, pet.color);
    }
    byte  a = 127;

    @Override
    public int hashCode() {
        return Objects.hash(age, weight, height, color);
    }
}
