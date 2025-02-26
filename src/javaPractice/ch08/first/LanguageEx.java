package javaPractice.ch08.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LanguageEx {
	public static void main(String[] args) {
		
		ArrayList<String> test = new ArrayList<>();
//		List<String> test = new ArrayList<>();
//		List<String> test = new Vector<>();
		
		System.out.println(test.size());
		
		test.add("김길동");
		test.add("이길동");
		test.add("박길동");
		test.add("최길동");
		test.add("정길동");
		test.add("윤길동");
		test.add("강길동");
		test.add("홍길동");

		System.out.println(test.size());
		
		for(int i = 0; i < test.size(); i++) {
			System.out.println("test.get(i): " + test.get(i));
		}
		
		for(String a : test) {
			System.out.println("a: " + a);
		}
		
//		test.remove(7);
//		test.remove(2);
//
//		System.out.println(test.size());

	}

}
