package sec06.exam02.mycompany;

//import sec06.exam01.SnowTire;
import sec06.exam02.hankook.*; //Tire
import sec06.exam02.kumho.*; //BigWidthTire, Tire
import sec06.exam02.hyundai.Engine; //Engine

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	// Ctrl + Shift + O 를 눌러서 import생성 가능
	
	//Tire tire3 = new Tire(); 
	//두개의 패키지에 소속되었어서 컴파일에러
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire(); 
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	//여러개의 패키지면 패키지명을 다 써야 함.
	
}
