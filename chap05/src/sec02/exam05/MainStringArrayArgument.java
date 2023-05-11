package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) { //파라메터? 
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);//의도적 안전한 종료.(실행을 종료한다.)
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}

}
