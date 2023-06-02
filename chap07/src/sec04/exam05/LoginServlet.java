package sec04.exam05;

public class LoginServlet extends HttpServlet{

	@Override
	public void service() { //service는 추상클래스의 이름
		System.out.println("로그인 합니다.");
	}

}
