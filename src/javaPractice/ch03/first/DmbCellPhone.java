package javaPractice.ch03.first;

public class DmbCellPhone extends CellPhone{

	public DmbCellPhone(String model, String color) {
		super(model, color);
	}
	
	
	void powerOn() {
		System.out.println("Hi,전원을 킵니다");
	}
	
	void powerOff() {
		System.out.println("Bye, 전원을 끕니다");
	}
}
