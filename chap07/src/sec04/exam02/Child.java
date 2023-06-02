package sec04.exam02;

public class Child extends Parent{
	private String name;
	
	public Child() {
//		super(); 이게 숨어있음
		this("홍시");
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("child(String name) call");
	}
}
