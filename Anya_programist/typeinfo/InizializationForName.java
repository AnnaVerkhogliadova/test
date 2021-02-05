package Anya_programist.typeinfo;

import java.util.*;

public class InizializationForName {
	public static void main(String [] args) throws Exception {
		Class.forName("Foo");
	}
}

class Foo {
	static {
		System.out.println("Foo initializing");
	}
}
