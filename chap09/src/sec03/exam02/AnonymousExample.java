package sec03.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.field.turnOff();
		//익명 객체 로컬변수사용
		anony.method2(
			new RemoteControl() {

				@Override
				public void turnOn() {
					System.out.println("TV켜");
				}
	
				@Override
				public void turnOff() {
					System.out.println("켜");
				}	
			}
		);
	}
}
