package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3]; //3층
		strArray[0] = "Java"; //0=1층
		strArray[1] = "Java"; //1=2층
		strArray[2] = new String("Java"); //2=3층
		// new String은 주소가 달라져서 이름이 같아도 다른 객체로 취급.
		
		
		System.out.println( strArray[0] == strArray[1]); 
		System.out.println( strArray[0] == strArray[2]);
		System.out.println( strArray[0].equals(strArray[2]));
		//.equals는 String의 이름만 같아도 참true
	}

}
