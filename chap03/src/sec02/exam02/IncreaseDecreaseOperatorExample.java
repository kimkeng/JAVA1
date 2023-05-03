package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x=" + x);
		//x++은 후 행 증가(값에다가 x를 넣어주고 하나 올려준다.) ++x는 선 행 증가 (값에다가 하나 올려주고 x를 넣어준다.)
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("---------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = ++x; 
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("---------------");
		z = ++x + y++; 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
