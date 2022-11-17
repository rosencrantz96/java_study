package test.ch06.question;

public class Example1 {
	// isNumber 작성
	public static boolean isNumber(String str) {
		// 주어진 문자열이 null이거나 빈문자열 ""이라면 false를 반환한다.
		if (str == null || str.equals("")) {
			return false;
			} // 중괄호 생략 가능
		
		/*
		주어진 문자열이 모두 숫자로 이루어져있는지 확인한다. 
		모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다. 
		
		문자열 -> 배열로 만들 수 있다. 
		*/
		
		for (int i=0; i < str.length(); i++) {
			/* 
			유니코드 값 알아보는 방법  
			char a = '0';
			System.out.println((int)a);
			*/
			char ch = str.charAt(i); // 123이 들어오면 배열 인덱스번호 0, 1, 2를 찍음 
		
			if (ch < '0'  || ch > '9') { // 문자열 0보다 작거나 문자열 9보다 크면 숫자가 아님. 
				return false;
			} 				
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
