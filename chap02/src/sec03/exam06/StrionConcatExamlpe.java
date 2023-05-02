package sec03.exam06;

public class StrionConcatExamlpe {

	public static void main(String[] args) {
		//숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//결합 연산 
		//더하기는 처음부분 부터 계산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		//숫자 10 + 2 + 문자 8
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		//숫자 10 + 문자 2 + 숫자 8
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		//문자 10 + 숫자 2 + 숫자8
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);
		//(숫자2 + 숫자 8) + 문자 10
	}

}
