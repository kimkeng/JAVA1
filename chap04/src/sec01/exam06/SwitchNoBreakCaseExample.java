package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간: " + time + " 시]");
		//8<- ,,,< 12(8+4) 사이의 정수 얻기
		
		switch(time) {
		case 8:
			System.out.println("출근 합니다.");
		case 9:
			System.out.println("회의 합니다.");
		case 10:
			System.out.println("업무 합니다.");
		default:
			System.out.println("외근 합니다.");
		//break를 안쓰면 값이 case 8 일때 모두 실행을 한다.
		}
	}

}
