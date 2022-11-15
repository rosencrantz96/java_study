package test.ch06;

public class Calculator2 { // Calculator2의 멤버 - 필드, 메소드 멤버 (클래스를 구성하고 있는 필드나 메소드들을 멤버라고 한다.) 
	// 1. 필드 (속성)	
	static double pi = 3.13159; // 정적 메소드 만드는 방법 : 앞에다가 static 붙이면 됨. (실행하자마자 메모리에 올라감)
	// 정적 멤버가 아니라 인스턴스 멤버로 만들면 메모리에 올라가지 않음. new로 생성을 해줘야 올라감!
	// static이 붙으면 static영역에 따로 저장
	// 얘를 왜 쓰나욤? 자바스크립트에... 전역변수랑 비슷한거...라고하는 것 같음 자스 개싫어서 설명 제대로 안 들음 나중에 찾아보기 
	// 클래스 안에 있지만 여기저기서 가져다 쓸 수 있다. static의 중요한 특징. 
	// 왜? run을 실행하자마자 메모리에 적재가 되니깐요. 클래스 안에 있지만 클래스에 귀속된 것이 아님. (자바는 클래스 바깥에 쓸 수 없어) 메모리 구조를 이해하래욧
	
	// static 필드
	static String model = "calc1";
	static String number = "1";
	static String info;	
	
	// static 블록: static 필드에 대한 초기화 작업이 필요할 때 사용 
	static {
		// 정적 블록에 대한 초기화 작업 
		info = model + "_" + number; // 요청 수행 (인포에 이름을 넣어달라!): calc_1 ( 이 값이 info에 들어감)
	}
	
	
	// 2. 메소드 (기능) - 멤버! 라고 생각해주세요. 얘들은 인스턴스 멤버. 객체를 통해서 들어갈 수 있는 멤버. 
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	
	
}
