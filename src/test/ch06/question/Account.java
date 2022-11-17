package test.ch06.question;

public class Account {
	// 필드 선언 
	private int balance; // 잔고 저장 
	// 상수 선언: static final을 무조건 붙여야 함! 변수 무조건 대문자로 써야 함. 
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		// 1. 0 <= balance <= 1000000 범위 정상 출력: this.balance = balance;
		// 2. 매개값이 음수이거나 백만원을 초과하면 (정상 범위가 아니라면) 현재 balance값 유지 
		
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} 
		
	}

}
