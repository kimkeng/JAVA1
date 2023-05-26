package sec06.exam04.package1;

public class A { //클래스는 퍼블릭이나 퍼블릭을 안붙이는 것만 가능(프라이빗 디폴트는 사용불가)
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {} //퍼블릭
	A(int b) {} //디폴트
	private A(String s) {} //프라이빗
}
