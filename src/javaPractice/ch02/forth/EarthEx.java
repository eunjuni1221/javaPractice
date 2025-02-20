package javaPractice.ch02.forth;

public class EarthEx {
	public static void main (String [] args) {
		
		System.out.println("제일 높은 건물의 높이는 " + Earth.TOP_BUILDING + " 입니다");
		
		Earth earth = new Earth();
		
		earth.print();
	}
}
