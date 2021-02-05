package Anya_programist.collection;

import java.util.*;

public class TestString {
	public static void main(String[] args) {
		long startTimeString = System.currentTimeMillis();
		String a = "";
		for(int i = 0; i < 1_000_00; i++) {
			a = a + "a";
		}
		long endTimeString = System.currentTimeMillis();
		long startTimeStringBuilder = System.currentTimeMillis();
		StringBuilder b = new StringBuilder("");
		for (int i = 0; i < 1_000_00; i++) {
			b.append("a");
		}
		b.toString();
		long endTimeStringBuilder = System.currentTimeMillis();
		long startTimeStringBuffer = System.currentTimeMillis();
		StringBuffer f = new StringBuffer("");
		for (int i = 0; i < 1_000_00; i++) {
			f.append("a");
		}
		f.toString();
		long endTimeStringBuffer = System.currentTimeMillis();
		System.out.println(endTimeString - startTimeString);
		System.out.println(endTimeStringBuilder - startTimeStringBuilder);
		System.out.println(endTimeStringBuffer - startTimeStringBuffer);
	}
}