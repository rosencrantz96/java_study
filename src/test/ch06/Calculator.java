package test.ch06;


public class Calculator { // 순수하게 객체 생성을 위한 클래스를 만드는 것. (main 체크 ㄴㄴ)
	// 메소드 오버로딩: 같은 이름의 메소드 여러개를 만든다.
	// ★매개변수의 순서, 갯수, 타입 중 하나가 달라야 한다. 
	// 메소드 오버로딩을 하는 이유! 코드를 살짝 다르게 해서 다른 결과값을 줄 수 있어서? (이름은 같지만 (다르게 해도 됨) 디테일에서 차이를 주는 값을 얻기 위해...?) 
	
	double areaRectangle(double width) { // 정사각형의 넓이
		return width * width;
	}
	/*
	double areaRectangle(double h, int a) {
		return h * h;
	}
	*/
	double areaRectangle (double width, double height) { // 직사각형의 넓이 
		return width * height;
	}
	
	
	
	/*
	// 리턴값이 없는 메소드 선언
	// 리턴시키는 값이 없을 때는 void를 써줘야 한다! 
	// 메소드 - calculator의 멤버? 
	void powerOn() {
		System.out.println("전원을 켭니다.");
//		return 0; // void를 썼는데 리턴값 주면 에러남. 그냥 리턴만 쓰면 에러 안 남. (값을 주는게 아니니까) 걍 리턴은 안 써도 됨. 
//		return;
	}
	
	// 메소드: 기능이라고 생각합시다!!! (함수) 
	// 메소드를 써주는 건 자바스크립트랑 똑같은데 ★타입★을 꼭 써줘야 함!!! 
	// 객체의 구성: 기능과 속성!!!!  기억하세요 
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// int형으로 리턴값이 있는 메소드
	// 리턴 타입, 매개 변수 타입 다 있어야 함
	int plus(int x, int y) { 
		int result = x + y;
		return result;
	}
	
	// double형으로 리턴값이 있는 메소드
	double divide(int x, int y) { // double 타입과 int 타입은 result가 필요함!! 
		double result = (double)x / (double)y;
		return result;
	}
	
	// 기능을 네 가지 구현해둔 것! 
	 */
}

