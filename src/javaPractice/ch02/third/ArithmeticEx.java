package javaPractice.ch02.third;

public class ArithmeticEx {
	public static void main(String[] args) {
		// int a = 7;
		// int b = 8;
		
		// 1
		// System.out.println(a + "+" + b + "=" + (a+b));
		// 2 (함수)
		// System.out.println(a + "+" + b + "=" + sum(a, b));
		
		//3
		Arithmetic arithmetic = new Arithmetic(7, 8);
		arithmetic.print();
		System.out.println(arithmetic.a + " + " + arithmetic.b + " = " + arithmetic.sum());
	}
	
//	static int sum (int a, int b) {
//		return a + b;
//	}
	
}
