package sec06.exam06;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <0 ) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
		
	}
	
	
	public boolean isStop() { //논리형은 get, set이 아닌 is, set으로 사용
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
