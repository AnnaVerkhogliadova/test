package Anya_programist.typeinfo;

import java.util.*;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = 
		ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Инициализвция Initable");
	}
}

class Initable2 {
	static int staticNonFinal = 147;
	static {
		System.out.println("Инициализвция Initable2");
	}
}

class Initable3 {
	static int staticNonFinal = 74;
	static {
		System.out.println("Инициализвция Initable3");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);
	public static void main(String[] args) throws Exception {
		Class initable = Initable.class;
		System.out.println("После создвния ссылки на Initable");       //не запускается процессс инициалации
		System.out.println(Initable.staticFinal);                      //запускается процессс инициалации
		System.out.println(Initable.staticFinal2);                     //запускается процессс инициалации
		System.out.println(Initable2.staticNonFinal);
		Class initable3 = Class.forName("Initable3");
		System.out.println("После создания ссылки на Initable3");
		System.out.println(Initable3.staticNonFinal);
	}
}
		