package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2(); //Override되서 Child가 실행됨.
//		parent.method3(); 부모클래스 타입변환을 해서 Child Class는 사용 못 함.
	}

}
