package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90 ,87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
		sum1 += scores[i];
	  }
		System.out.println("총합1: " + sum1);
		
		int sum2 = add(new int[] { 83, 90 ,87 });//add는 더하다 라는 함수
		System.out.println("종합2: " + sum2);
	}
	//아래는 새로 함수를 써 준것
	public static int add(int[] scores) { //var scores = new int[] { 83, 90 ,87 }
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("종합3: " + sum);
		return sum; //이름대로 돌려주다 라는뜻
	}
}
