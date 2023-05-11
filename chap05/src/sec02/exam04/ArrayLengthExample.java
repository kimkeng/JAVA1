package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //length는 값이아닌 값의 갯수 
			sum += scores[i];
		}
		// scores.length = 5; //배열은 한번 설정하면 바뀌지 않는다.
		System.out.println("총합:" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균:" + avg);
		
	}

}
