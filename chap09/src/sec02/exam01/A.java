package sec02.exam01;

public class A {
	A() {System.out.println("A 객체가 생성됨");}

//	인스턴스 or noneStatic
	public class B{
		B() {System.out.println("B 객체가 생성됨");}
		int field1;
//		static int field2; //컴파일 에러 부모한테서 만들어줘야 사용 가능
		void method1() { }
//		static void method1() { } //위와 같은 이유로 사용 불가능
	}
	
//	정적 or static
	static class C{
		C() {System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	
//	A클래스의 메소드
	void method() {
//		로컬 클래스
		class D{ //얘는 메소드의 변수급이여서 static이 의미가없고 못 붙임 public도 같은 이유
			D() {System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2(){};
		}
		D d = new D(); // 메소드 안에서만 생성 가능
		d.field1 = 3;
		d.method1();
	}
}
