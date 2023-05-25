package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("980502-112233", "김경민");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; 컴파일 에러
		//p1.ssn = "123456-7890101"; 컴파일 에러
		p1.name = "홍길동";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}

}
