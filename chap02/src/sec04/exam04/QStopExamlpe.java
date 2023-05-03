package sec04.exam04;

public class QStopExamlpe {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
				//값이 113이면 종료
			}
		}
		
		System.out.println("종료");
	}

}
