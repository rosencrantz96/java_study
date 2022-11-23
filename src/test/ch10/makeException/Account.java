package test.ch10.makeException;

public class Account {
	// 필드
	private long balance; // 잔고
	
	// 생성자
	public Account() {}

	// 메소드
	public long getBalance() {
		return balance;
	}
	
	// 저축 메소드
	public void deposit(int money) { // money: 저축하려는 돈 
		balance += money; // 잔고에 돈을 누적 합산 
	}
	
	// 출금 메소드
	public void withdraw(int money) throws InsuffException { // money: 출금하려는 돈
		// 잔고보다 내가 출금하려는 돈이 더 크면 예외 발생시킴
		if (balance < money) { // 출금이 더 크면 예외를 발생시키겠다! 
			throw new InsuffException("잔고 부족: " + (money - balance) + "원이 모자람.");
		} 
		
		balance -= money; // 잔고에서 출금하려는 돈을 빼줌. 
	}
}
