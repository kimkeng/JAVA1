package test9;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button(); //생성자
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
