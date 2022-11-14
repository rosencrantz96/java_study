package test.ch06;

public class Calculator2 { // Calculator2의 멤버 - 필드, 메소드 멤버 (클래스를 구성하고 있는 필드나 메소드들을 멤버라고 한다.) 
	// 1. 필드 (속성)	
	static double pi = 3.13159; // 정적 메소드 만드는 방법 : 앞에다가 static 붙이면 됨. 
	
	// 2. 메소드 (기능) - 멤버! 라고 생각해주세요. 얘들은 인스턴스 멤버. 객체를 통해서 들어갈 수 있는 멤버. 
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	
	
}
