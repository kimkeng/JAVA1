package sec02.exam04;

public class ArithmenticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);

		int result2 = v1 - v2;
		System.out.println("result2=" + result2);

		int result3 = v1 * v2;
		System.out.println("result3=" + result3);

		int result4 = v1 / v2;
		System.out.println("result4=" + result4);

		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		// v1(5)을 v2(2)로 남는 나머지 값. 1
		
		double result6 = (double) v1 / v2;
		System.out.println("result6=" + result6);
	}

}
