package test.ch10.makeException;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account(); // 계좌 생성
		
		// 저축
		account.deposit(10000); // 만원 저축 
		System.out.println("예금액: " + account.getBalance()); // 잔고 가져옴
		
		// 출금
		try {
			account.withdraw(30000); // 메소드를 출력한 곳에서 에러를 받아야 한다. 
		} catch (InsuffException e) {
			String message = e.getMessage(); // 에러 메세지 받기
			System.out.println(message);
		} 
		
	}

}
