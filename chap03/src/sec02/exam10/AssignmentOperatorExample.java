package sec02.exam10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		
		result += 10;
		//+=더하기
		System.out.println("result= " + result);
		result -= 5;
		//-=빼기
		System.out.println("result= " + result);
		result *= 3;
		//*=곱하기
		System.out.println("result= " + result);
		result /= 5;
		
		System.out.println("result= " + result);
		result %= 3;
		System.out.println("result= " + result);
	}

}
