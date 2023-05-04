package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; 
		//char는 + 1 을 한번만 사용 가능하고 두번 사용하게되면 int로 인식을 함.고로 c2는 int로 됨
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		//c2 = A(65)에서 +1을 해줘서 B(66)이 나옴
		//System.out.println("c3: " + c3);
	}

}
