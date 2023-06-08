package sec02.exam05;

public class CarExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nasted nested = outter.new Nasted();
		nested.print();
	}

}
