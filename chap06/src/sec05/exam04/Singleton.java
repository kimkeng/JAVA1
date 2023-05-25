package sec05.exam04;

public class Singleton {
	//싱글톤 생성 방법
	
	// 객체 생성(new) 을 통해서 생성한정적 필드
	private static Singleton single = new Singleton();
	
	// 생성자 (생성자에게는 static (정적) 을 못 붙임)
	private Singleton() {}
	
	// 정적 메소드
	static Singleton getInstance() {
		return single;
	}
}
