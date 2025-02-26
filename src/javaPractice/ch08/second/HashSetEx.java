package javaPractice.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<String> computerLangs = new HashSet<>();
		
		computerLangs.add("Java");
		computerLangs.add("JavaScript");
		computerLangs.add("HTML");
		computerLangs.add("CSS");
		computerLangs.add("Spring");
		
		for(String computerLang : computerLangs) {
			System.out.println(computerLang);
		}
	}
}
