package sec02.exam07;

public class FloatDoubleExamlpe {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14; 끝에 f를 안써서 컴파일 에러 디폴트float 더 큰범위 double
		float var2 = 3.14F;
		double var3 = 3.14;
		
		//몇까지 계산되나 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	    	
		//e 사용
		double var6 = 3e6;  //e는 0의 갯수이고 3e6은 앞자리3는 3이고 0을 6개 붙여라
		float var7 = 3e6F;  //위에와 같지만 끝에 F를 붙임 F를 대문자로 쓰는건 그냥 약속
		double var8 = 2e-3; //역으로 봐라  
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}

}
