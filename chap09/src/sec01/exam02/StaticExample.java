package sec01.exam02;

class Name{
	static void print() { //스태틱 메소드
		System.out.println("내 이름은 홍.");
	}
	void print2() { //인스턴스 메소드
		System.out.println("내 이름은 이.");
	}
}

public class StaticExample {
	public static void main(String[] args) {
		Name.print();//생성자 없이 사용 가능
		
		Name name = new Name();//생성자 만들어야 호출 가능
		name.print2();//인스턴스를 생성해야만 호출이 가능

	}

}
