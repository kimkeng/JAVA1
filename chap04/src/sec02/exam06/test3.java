package sec02.exam06;

public class test3 {

	public static void main(String[] args) {
	int x = 0;
	for(int y=1;y<=10;y++) {
		x += y;
		System.out.print(y);
		if(y!=10) {
			System.out.print("+");
		}
	}
	System.out.print("="+ x);
	}

}
