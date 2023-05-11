package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 ="김경민";
		String strVar2 ="김경민";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
			System.out.println("");
		}

		
		String strVar3 = new String("김경민");
		String strVar4 = new String("김경민");
		//클래스 인스턴트 이름 두개를 써서 다름.
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.contentEquals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
	}

}
