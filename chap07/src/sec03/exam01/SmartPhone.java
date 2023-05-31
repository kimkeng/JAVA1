package sec03.exam01;

public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}//추상클래스를 상속 받으려면 꼭 추상클래스의 생성자를 super로 넣어줘야함.
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
