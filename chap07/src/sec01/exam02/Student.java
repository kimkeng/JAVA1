package sec01.exam02;

public class Student extends People{ //extends는 상속을 받겠다는 뜻.
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); 
		this.studentNo = studentNo;
	}
}
