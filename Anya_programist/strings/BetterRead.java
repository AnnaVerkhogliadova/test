package Anya_programist.strings;

import Anya_programist.collection.SimpleRead;

import java.util.*;

public class BetterRead {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(SimpleRead.input);
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println(
			"How old are you? What is your favorive double?");
		System.out.println("(input: <age> <double>)");
		int age = stdin.nextInt();
		double favorive = stdin.nextDouble();
		System.out.println(age);
		System.out.println(favorive);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 year you will be %d.\n", age + 5);
		System.out.format("My favorive double is %f.", favorive / 2);
	}
}