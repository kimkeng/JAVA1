package sec03.exam04;

public class ByteOperationExamlpe {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		//long result = (long)value1 + (long)value2 + (long)value3; 전체 long으로 전환
		long result = value1 + value2 + value3;
		//byte result = value1 + value2 + value3; 값이 127(byte의 최대범위)을 넘어서 에러뜸.
		System.out.println(result);
	}

}
