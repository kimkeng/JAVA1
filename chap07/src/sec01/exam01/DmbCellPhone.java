package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		//this.model = model;
		//this.color = color;
		super(model,color); //super은 부모에게 있는것을 가져오라는 것.
		//부모가 명시적으로 매개값을 받는 생성자가 있을 경우 지식 클래스를 작성할 떄 
		//super()로 부모 생성자를 호출할 때 파라메터에 맞게 올바르게 호출할 수 있도록 만들어 주지 않으면 컴파일 에러가 발생
		this.channel = channel;
	}
	
	//메소드
	void trueOnDmb() {
		System.out.println("채널" + channel + "빈 DMB 방송 수신을 시작합니다.");
	}
	void chageChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}