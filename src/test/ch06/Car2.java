package test.ch06;

public class Car2 {
	// ★ 메모리 구조 !!!! static은 instance 접근 불가 !!! 이거 두 개 중요 !!!!!!!
	

	// 인스턴스 필드	
	int speed;
	
	// 인스턴스 메소드
	void run() { // void가 붙으면 리턴 타입이 없는 메소드 
		System.out.println(this.speed + "으로 달립니다."); // this는 붙여도 되고 안붙여도 됨. 
	}
	
	void run2() { 
		this.run(); // 인스턴스 메소드는 메소드 간에도 호출 가능 
		System.out.println(this.speed + "으로 달립니다."); // this는 붙여도 되고 안붙여도 됨. 
	}
	
	/*
	static { // static에는 인스턴스에 관련된 모든 것 필드/메소드 모두 접근이 불가능하다! 
		this.speed = 200; // 에러. 
  		this.run();
	}
	*/
	
	// 정적(static) 메소드 (static만 붙여주면 됩니다.) 
	static void simulate() {
//		this.speed = 200; // 인스턴스 필드라서 사용 불가함. 아래 방식과 같이 객체를 따로 생성해서 접근해야 한다. 
//		this.run(); // 정적 메소드에서는 불가 ㅠ 에러 ㅠ 
		
		Car2 myCar = new Car2(); // simulate는 Car2 클래스 안에 있는데 Car2의 인스턴스를 생성할 수 있다. 자기 자신 안에서도 함수(메소드)를 만들어서 인스턴스 호출 가능. ㅅㅄㅄㅄㅂ
// myCar에 Car2라는 객체가 들어온 것임 (simulate 메소드는 myCar라는 객체 생성) 
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) { // 실행하면! 메인 메소드가 가장 먼저 실현된다! 
		simulate(); 
		
		Car2 myCar = new Car2(); // 위에 있는 객체랑 변수명은 같지만 다른 객체 (결과값이 다르게 찍힌다) 
		
		myCar.speed = 60;
		myCar.run();
		
	}

}
