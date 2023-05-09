package sec02.exam02;

public class test1 {

	public static void main(String[] args) {
		int[] x;
		x = new int[] {5,10,20};
		int y = 0;
		for(int i=0; i<3; i++) {
			y += x [i];
		}
		System.out.println("합계: " + y);
			
	}

}
