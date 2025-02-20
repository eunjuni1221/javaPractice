package javaPractice.ch03.first;

public class CellPhone {
	
	String model;
	String color;
	
	public CellPhone (String model, String color) {
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 킵니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
}
