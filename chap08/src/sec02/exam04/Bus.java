package sec02.exam04;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스 달려");
	}
	
	public void checkFare() {
		System.out.println("승차요금 체크");
	}
}
