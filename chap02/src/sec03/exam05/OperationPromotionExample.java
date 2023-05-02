package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte vyteValue3 = byteValue1 + byteValue2; //컴파일 에러 byte변수끼리 더하면 int로 승격 시켜줘야 함
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A'+1; //A를 숫자로 바꾸면 65 여기다가 +1을 해 주면 66
		char charValue2 = 1;
		//char chatValue3 = charValue1 + charValue2; //컴파일 에러 char끼리 합치면 int로 승격 시켜줘야 한다.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2); //A (65) + 1이라 67
		System.out.println("출력문자=" + (char)intValue2); //(char)intValue2는 강제 형 변환을 한것.
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4); //int는 정수형이라 소수점은 다 버림
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; 컴파일 에러 4.0이 int가 아님
		//int intValue6 = 10 / (int)4.0; 이렇게 해야 계산 가능
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y; //x에 강제 형 변환을 줘서 계산가능
		System.out.println(result);
	}

}
