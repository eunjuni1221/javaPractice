package javaPractice.ch04.third;

public class TelevisionEx{
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new SettopBox();
		remoteControl.turnOn();
		
		RemoteControl remoteControl2 = new Television();
		remoteControl2
		.turnOff();

	}

}
