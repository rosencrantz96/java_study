package test.ch06.question.last;

public class Account { // 코드를 만들어둔 설계도 (클래스 구성 멤버: 필드, 생성자, 메소드)
	// 필드: 속성
	private String ano; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고
	
	// 생성자: 객체를 생성할 때 실행됨. 초기화!  
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 메소드: 기능 (private에 접근할 수 있게 하기 위해서 게터, 세터 만들어줌) 
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
