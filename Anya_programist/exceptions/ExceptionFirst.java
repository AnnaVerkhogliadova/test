package Anya_programist.exceptions;

public class ExceptionFirst {
	public static void f() throws ExceptionTest{
		throw new ExceptionTest();
	}
	public static void main(String[] args) {
		try {
			f();
		} 	catch(ExceptionTest e) {
			System.out.println("В кетч1");
		}
	}
}

class ExceptionTest extends Exception {
	private static final long serialVersionUID = -4982412457927680419L;
}
	
		