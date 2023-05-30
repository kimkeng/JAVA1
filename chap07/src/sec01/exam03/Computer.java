package sec01.exam03;

public class Computer extends Calculator{
	@Override //안붙여도 되지만 붙이면 좋음.
	double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle() 실행");
			return Math.PI *r*r;
	}
}
