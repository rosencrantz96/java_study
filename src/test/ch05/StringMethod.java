package test.ch05;

import javax.security.auth.Subject;

public class StringMethod {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String 공부중";
		
		String[] tokens = board.split(",");
		
		for (int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		/*
		String subject = "자바 프로그래밍";
		//문자열이 시작하는 인덱스 번호 알려준다. 자바스크립트랑 똑같음. 
		int location = subject.indexOf("우하하");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		if(location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		} 
		
		boolean result = subject.contains("자바");
		
		if (result) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}
		*/
		
		/*
		String ssn = "960803-1230123";
		// 문자열을 잘라준다! 매개변수에 시작 인덱스와 끝 인덱스를 써주면 됨. (끝 인덱스 이전까지 잘라줌!!!)
		String firstName = ssn.substring(0, 6);
		System.out.println(firstName);
		// 매개변수를 하나만 쓰면 7번째 인덱스부터 끝까지 잘라준다. 
		String secondName = ssn.substring(7);
		System.out.println(secondName);
		*/
		
		
		/*
		String oldStr = "자바 문자열";
		// 첫 번째 매개변수에는 바꾸고싶은 문자열을 써주면 된다. 두 번째 매개변수에는 바꿀 내용
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		*/
		
		
		/*
		String ssn = "9608031230123"; // 주민번호
		char sex = ssn.charAt(6);
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 맞지 않습니다.");
		}
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		*/
		
 	}

}
