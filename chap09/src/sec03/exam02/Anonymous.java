package sec03.exam02;

public class Anonymous {
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV켜");
		}

		@Override
		public void turnOff() {
			System.out.println("켜");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV켜");
			}

			@Override
			public void turnOff() {
				System.out.println("켜");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
		
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	};
}
