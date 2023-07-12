package test9;

public class MessageListener implements Button.OnClickListener{
	//중첩클래스여서 Button.을 붙여줌

	@Override
	public void onClick() {
		System.out.println("메시지 보냄");
	}

}
