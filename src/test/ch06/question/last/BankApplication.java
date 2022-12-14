package test.ch06.question.last;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
	
	// 계좌 객체를 담을 배열 (초기값 null)
	private static Account[] accountArray = new Account[100]; // 배열 쓸 때 Account 객체를 담을 배열이기 때문에 데이터형식이 아니라 객체명 써줌
	// 100개의 length를 담을 수 있는 계좌 객체 배열이 생성됨 
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt(); // 숫자형으로 받음 
			
			if (selectNo == 1) createAccount(); 
			else if(selectNo == 2) accountList();
			else if(selectNo == 3) deposit();
			else if(selectNo == 4) deposit();
			else if(selectNo == 5) run = false;
		}
		System.out.println("프로그램 종료.");
	}

	// static이 있어야 main 메소드에서 바로 호출 가능
	// 1. 계좌 생성 
	public static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.next(); // string형으로 받음 
		
		System.out.println("계좌주: ");
		String owner = scanner.next();
		
		System.out.println("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); // 계좌 만듦
		
		for(int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) { // accountArray에서 빈 방을 찾아 값을 넣어준다. 
				accountArray[i] = newAccount; // 생성한 계좌를 배열에 넣어준다. 
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; // 계좌 넣고  반복문을 끝낸다. 
			}
//			System.out.println(accountArray);
		}
		
	}
	
	// 2. 계좌 목록 
	public static void accountList() {
		for (int i=0; i<accountArray.length; i++) {
			
		}
	}
		
	// 3. 예금
	public static void deposit() {
		// 계좌번호, 예금액 입력받기 (scanner)
		// 계좌번호로 계좌를 찾아야 한다. 
		Account account = findAccount(ano); 호출
		// 찾은 계좌에 예금을 해준다. 
		account.setBalance(account.getBalance() + 예금액);
	}
	
	// 4. 출금 
	public static void withdraq() {
		// 계좌번호, 예금액 입력받기 (scanner)
		// 계좌번호로 계좌를 찾아야 한다. 
		Account account = findAccount(ano); 호출
		// 찾은 계좌에 출금을 해준다. 
		account.setBalance(account.getBalance() - 출금액);
	}
	
	//5. accountArray 배열에서 ano가 동일한 Account객체를 찾는 역할을 한다. 
	private static Account findAccount(String ano) {
		Account account = null;
		
		for (int i=0; i<accountArray.length; i++) { // 계좌를 담은 배열을 쫙 돌림
			if (accountArray[i] != null) { // null 이 아니라는 이야기는 계좌가 있다는 이야기임 (객체가 있다) 
				//  불러온 계좌 안에 있는 계좌번호와 매개변수로 받아온 계좌번호 ano가 같은지 체크! 
				String dbAno = accountArray[i].getAno(); // 해당하는 객체의 계좌번호를 가져옴! 
				
				if (dbAno.equals(ano)) { // 문자열은 equals로 비교 
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	
}
