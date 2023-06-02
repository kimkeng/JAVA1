package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus); //매개변수 바꾸기
		
//		Vehicle vehicle = bus;  //이 뜻 (자동 타입 변환)
	}

}
