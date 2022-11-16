package test.ch06;

public class GetSet {
	// 필드 생성 	
	private int speed;
	private boolean stop; // 자동차가 멈췄을 때 true 0, 자동차가 달릴 때 false 1 
	
	// 우클릭 > Source > Generate Getters and Setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0; // 음수일 경우 0을 주기 
			return; // 함수 끝냄
		} else {
			this.speed = speed; // 양수가 들어오면 그대로 값을 세팅하면 됨 
		}
	}
	public boolean isStop() { 
		return stop; 
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0; // 한 줄이라 중괄호 생략 
		
		
		
		
		
		
	}
	
	/*
	public int getSpeed() { // 리턴을 해주면 됨 
		return this.speed;  
	};	
	public void setSpeed(int speed) { // 매개변수로 바꿀 speed의 값을 가져온다. 
		this.speed = speed; // 값 세팅
	};
	*/
}
