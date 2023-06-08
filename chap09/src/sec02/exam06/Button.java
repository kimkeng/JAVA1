package sec02.exam06;

public class Button {
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) { //형변환
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
		
	}
}
