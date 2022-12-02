package test.ch13.sync;

public class User2Thread extends Thread {
private Calculator calculator;
	
	public User2Thread() {
		setName("user2Thread"); // 스레드의 이름 변경 
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	// 스레드가 실제로 실행될 때 실행되는 코드 
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
