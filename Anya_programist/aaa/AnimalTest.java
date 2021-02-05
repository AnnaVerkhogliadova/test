package Anya_programist.aaa;

import java.util.*;

abstract class Animal {
	public void eat() {System.out.println(this + " eat()");}
	abstract public String toString();
}
class Dog extends Animal {
	public String toString() {return "Dog";}
}
class Cat extends Animal {
	public String toString() {return "Cat";}
}

public class AnimalTest {
	public static void main(String[] args) {
		List<Animal> an = Arrays.asList(new Dog(), new Cat());
		for(Animal animal : an) {
		animal.eat();
		}
	}
}
		