package sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
//	@Override
//	public void stop() {
//		System.out.println("스포츠카 멈춤");
//		speed = 0;
//	} 파이널 이여서 재정의 못함. 

}
