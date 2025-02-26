package javaPractice.ch08.third;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
	public static void main(String[] args) {
		
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("홍길동", 19);
		friends.put("홍길서", 29);
		friends.put("홍길남", 39);
		friends.put("홍길북", 49);
		friends.put("홍길중", 59);
		
//		friends.remove(friends);
//		friends.size();
//		System.out.println(friends.size());

		
		for(String strKey : friends.keySet()) {
//			Integer strValue = friends.get(strKey);
			System.out.print(strKey);
//			System.out.println(": " + strValue);
			System.out.println(": " + friends.get(strKey));
		}
	}
}
