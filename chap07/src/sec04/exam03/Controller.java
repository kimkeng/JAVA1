package sec04.exam03;

public class Controller {
	//필드
	public MamberService service;
	//var MemverService service = new AService()
	//메소드
	public void setService (MamberService service) {
		this.service = service;
	}
}

Controller controller = new Controller();
Controller.setService(-----------);

1) new Service() 부모여서 자동형변환 X
2) new MemberService() 본인 O
3) new AService() 자식 O
4) new BService() 자식 O
5) new BoardService() 사촌 X
6) new DService() 남 X