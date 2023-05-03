package sec02.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		// !는 부정(not)
		
		play = !play;
		System.out.println(play);
		// !붙은 값에 !를 더하면 긍정(부정+부정=긍정)
		// -붇은 값에 -를 더하면 +  (마이너스+마이너스=플러스)
	}

}
