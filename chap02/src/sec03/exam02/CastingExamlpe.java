package sec03.exam02;

public class CastingExamlpe {

	public static void main(String[] args) {
		//Casting(강제형 변환)  promotion(자동형 변환)	
		//char a = 44032;  44032는 아스키코드로 [가] 임.
		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
