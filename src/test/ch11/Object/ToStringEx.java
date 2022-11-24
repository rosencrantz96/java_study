package test.ch11.Object;

public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("애플", "IOS");
		
		// toString: 객체의 문자정보를 리턴을 한다. 
		// @5e91993f -> 객체를 나타내는 16진수의 해시코드
		String strObj = myPhone.toString();
		System.out.println(strObj);
		// 오버라이드를 해서 사용을 할 때는 특별하게 나타내고 싶은 문자 정보를 리턴한다. 
		System.out.println(myPhone); // 객체의 이름만 써도 보여주고 싶은 문자열을 찍음
	
		try {
			int value = Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			System.err.println("에러입니다."); // 빨간색 글자로 출력 
		}
	}

}
