package test.ch06;

import java.net.SocketOption;

public class Calculator { // 순수하게 객체 생성을 위한 클래스를 만드는 것. (main 체크 ㄴㄴ)
	// 리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
//		return 0; // void를 썼는데 리턴값 주면 에러남. 그냥 리턴만 쓰면 에러 안 남. (값을 주는게 아니니까) 걍 리턴은 안 써도 됨. 
//		return;
	}
	
	// 메소드: 기능이라고 생각합시다!!! 
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// int형으로 리턴값이 있는 메소드
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
}

