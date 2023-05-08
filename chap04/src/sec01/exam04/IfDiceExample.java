package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		//1부터 45까지의 난수 : (int)(Math.random()*44) + 1;
		//컴퓨터의 숫자는 0부터시작인데 *(곱하기)를 해야 해서 +1을 붙여준다.
		//Math라는 클래스에 random이라는 기능을 쓴것.
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
