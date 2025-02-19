package javaPractice.ch02.second;

public class CarEx {
	public static void main (String [] args) {
		Car car = new Car(250, "X4", "브루클린 그레이", "BMW");
		Car car2 = new Car(200, "Q5", "화이트", "Audi");
		Car car3 = new Car(50, "모닝", "노란색", "KIA");
		Car car4 = new Car(1000, "우르스", "빨간색", "람보르기니");
		
		System.out.println("name: " + car.name);
		System.out.println("name: " + car2.name);
		System.out.println("name: " + car3.name);
		System.out.println("name: " + car4.name);

	}

}
