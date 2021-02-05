package Anya_programist.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class InputFile {
	private BufferedReader in;
	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
			//Остальной код, способный возбуждать исключения
		}	catch(FileNotFoundException e) {
			System.out.println("Could not open " + fname);
			 //Файл не был открыт, закрывать не нужно
			 throw e;
		}	catch(Exception e) {
			//При других исключениях необходимо закрыть файл
			try {
				in.close();
			}	catch(IOException e2) {
				System.out.println("ошибка при выполнении in.close()");
			}
			throw e;
		}	finally {
			//Здесь файл не закрывается!
		}
	}
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		}	catch(IOException e) {
			throw new RuntimeException("ошибка при выполнении readLine()");
		}
		return s;
	}
	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() успешен");
		}	catch(IOException e2) {
			throw new RuntimeException("ошибка при выполнении in.close()");
		}
	}
}
			
			
			
			
			
			
			
			