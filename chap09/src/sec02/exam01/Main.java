package sec02.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		//인스턴스 멤버 클래스 겍체 생성
		A.B b = a.new B(); //a.new는 A클래스 안의 중첩생성된 클래스를 생성하라는 뜻.
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();//A클래스 안의 C를 뜻함
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;//static이라 객체생성없이 가능
		A.C.method2();//static이라 얘도 가능
		
		a.method();
	}

}
