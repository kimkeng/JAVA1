package sec04.exam02;

public class Parent {
	public String nation;
	
	public Parent() {
		this(".");
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
