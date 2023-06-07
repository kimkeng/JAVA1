package sec01.exam05;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;//인터페이스는 생성자 못 만듦.
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
