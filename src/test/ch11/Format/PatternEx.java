package test.ch11.Format;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		/*
		02-222-2222
		010-222-3232 
		*/
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; // 패턴을 넣을 문자열, 전화번호 체크 (이스케이프 문자... 역슬래시 한 번 더 해야 인식함)
		String data = "010-1234-5678";
		
		boolean result = Pattern.matches(regExp, data); // matches(패턴, 검증하고 싶은 데이터) 
		System.out.println(result);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; 
		data = "test@naver.com";
		
		result = Pattern.matches(regExp, data);
		System.out.println(result);
	}

}
