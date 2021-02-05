package Anya_programist.collection;

import java.util.*;
import java.util.regex.*;

public class PatternTest {
	public static void main(String[] args) {
		String a = "Anna loves dogs";
	Pattern p = Pattern.compile("(|^)l[a-z]{4,}");
		Matcher m = p.matcher(a);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}