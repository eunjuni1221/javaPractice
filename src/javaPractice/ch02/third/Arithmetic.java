package javaPractice.ch02.third;

public class Arithmetic {
	
	int a;
	int b;
	
	Arithmetic(){
		
	}
	
	Arithmetic(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return a + b;	
	}
	
	public void print() {
		System.out.println(a + " + " + b + " = " + sum());
	}

}
