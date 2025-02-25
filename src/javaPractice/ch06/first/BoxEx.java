package javaPractice.ch06.first;

public class BoxEx {
	public static void main (String [] args) {
		
		Box box = new Box();
		
		System.out.println(box);
		
		Box<Integer> box1 = new Box<>();
		
		box1.setT(1);
		System.out.println(box1.getT());

//		Box<int> box2 = new Box<>(); // 에러ㅏ 난다

		Box<String> box3 = new Box<>();
		box3.setT("OTL");
		System.out.println(box3.getT());

	}

}
