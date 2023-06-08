package sec02.exam05;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nasted{
		String field = "Nasted-field";
		void method() {
			System.out.println("Nasted-method");
		}		
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
