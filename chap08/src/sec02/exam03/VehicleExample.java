package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); 컴파일 에러
		
		Bus bus = (Bus) vehicle;//강제타입변환
		bus.run();
		bus.checkFare();
	}

}
