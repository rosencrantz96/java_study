package test.ch06;

public class Korea {
	// final 필드 (저장된 값들을 절대로 변경할 수 없다. 최종값) 
	// ★ final 필드는 초기값을 무조건 줘야 한다. (필드 선언 시 주거나 혹은 생ㅅ어자에서 줘야 한다.)
	final String nation = "대한민국"; // 초기값 주는 방법 1 - 얘처럼 필드에서 선언하면서 바로 주기 2 - 생성자에서 주기 
	final String ssn; // 주민번호 (-> 초기값 없으면 에러납니다. 생성자에서라도 줘야 함) 
	
	// 인스턴스 필드 
	String name;
	
	// 생성자 (생성자는 객체 인스턴스가 실행될 때 실행되는 코드...?) (클래스명과 같게 만들어주세요)  
	Korea(String ssn, String name) {
		// 초기값 주는 방법은 인스턴스와 똑같음! 
		this.ssn = ssn;
		this.name = name;
	}
	
	
	/*
	 * 자바스크립트
	 * const a = 1;
	 * 상수: 불변의 값
	 * 
	 * 자바에서의 상수
	 * 불변의 값(final), 공유해서 사용 가능(static)
	 * ex) 원주율: 3.14...
	 */
	
}
