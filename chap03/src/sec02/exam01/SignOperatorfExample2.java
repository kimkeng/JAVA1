package sec02.exam01;

public class SignOperatorfExample2 {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; //-100 
		int result2 = -x; // 100 (마이너스와 마이너스가 만나면 +)
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte result3 = -b; //컴파일 에러 byte는 변환이 되면 int로 바뀐다.
		int result3 = -b;
		System.out.println("result3=" + result3);
	}

}
