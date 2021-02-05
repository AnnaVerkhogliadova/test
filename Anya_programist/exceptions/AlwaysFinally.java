package Anya_programist.exceptions;

import java.util.*; 



public class AlwaysFinally {
	public static void main(String[] args) {
		System.out.println("Входим в первый блок try");
		try {
			System.out.println("Входим во второй блок try");
			try {
				throw new FourException("ошибка во втором блоке try");
			} finally {
				System.out.println("finally во втором блоке try");
			}
		}	catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Перехвачено FourException в первом блоке try");
		}	finally {
			System.out.println("finally в первом блоке try");
		}
	}
}

class FourException extends Exception {
	public FourException(String message){
		super(message);
	}
}
