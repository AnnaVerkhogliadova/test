package Anya_programist.typeinfo;

import java.util.*;

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("В методе main");
		new Candy();
		System.out.println("После создания объекта Candy");
		new Gum();
		try {
			Class.forName("Gum");
		}	catch(ClassNotFoundException e) {
			System.out.println("Не удалось найти Gum");
		}
		System.out.println("После вызова метода Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("После создания объектов Cookie");
	}
}

class Candy {
	static { System.out.println("Загрузка класса Candy"); }
}

class Gum {
	static { System.out.println("Загрузка класса Gum"); }
}

class Cookie {
	static { System.out.println("Загрузка класса Cookie"); }
}
