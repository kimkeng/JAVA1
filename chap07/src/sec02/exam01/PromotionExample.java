package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B bee = new B();
		C cee = new C();
		D dee = new D();
		E eee = new E();
		
		A a1 = bee;
		A a2 = cee;
		A a3 = dee;
		A a4 = eee;
		
		B b1 = dee;
		C c1 = eee;
		
//		B b3 = eee;
//		C c2 = dee;
	}

}
