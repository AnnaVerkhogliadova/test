package Anya_programist.exceptions;

import java.util.*;

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}
class Sneeze1 extends Annoyance {}

public class Human {
	public static void main(String[] args) {
	//Перехват точного типа:
		try {
			throw new Sneeze1();
		} 	catch(Sneeze1 s) {
			System.out.println("Перехвачено Sneeze");
		}	catch(Annoyance a) {
			System.out.println("Перехвачено Annoyance");
		}
		//Перехват базового типа:
		try {
			throw new Sneeze();
		}	catch(Annoyance a) {
			System.out.println("Перехвачено Annoyance");
		}
	}
}
 
