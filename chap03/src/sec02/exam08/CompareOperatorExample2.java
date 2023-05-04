package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		//float이 double로 변환시키면 값은 0.100000000149011612이다.
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
		//소수점 계산의 정확도를 올려주기 위해 v4*10을 해줘서 정수로만들어준다.
		//v4*10을 해준 값을 다시 10으로 나눠주면 정확한 소수점이 나온다.
	}

}
