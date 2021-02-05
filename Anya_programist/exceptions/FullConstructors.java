package Anya_programist.exceptions;

class MyException extends Exception {
	MyException() {}
	MyException(String msg) { super(msg); }
}

public class FullConstructors {
	public static void f() throws MyException {
		System.out.println("Возбуждаем MyException f()");
		throw new MyException();
	}
	private static void g() throws MyException {
		System.out.println("Возбуждаем MyException из g()");
		throw new MyException("Созано в g()");
	}
	public static void main(String[] args) {
		try {
			f();
		} 	catch(MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		}	catch(MyException e) {
			e.printStackTrace(System.out);
		}
	}
}
			