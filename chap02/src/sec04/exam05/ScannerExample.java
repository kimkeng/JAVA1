package sec04.exam05;

import java.util.Scanner;
//Ctrl + Shift + O 가 import를 만들어 준다.

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//scanner은 여러 문자를 저장할 수 있음 String
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")){
				break;
				//q를 누르면 종료
			} 
		}
		System.out.println("종료");
	}

}
