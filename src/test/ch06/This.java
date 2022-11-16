package test.ch06;

public class This { // 자동차 설계도! (클래스명 This)
	// 필드
	String model;
	int speed; 
	
	// 생성자
	// 매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에는 this를 붙인다. 
	This(String model) {
		this.model = model; // this 생략 불가: 뭐가 필드에서 쓰이는 모델이고 어떤게 매개변수 모델인지 알아보기 어려워서 
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() { // 같은 클래스 안에서 다른 메소드 호출할 때 This 클래스 안에 있기 때문에 this를 써줄 수 있지만 안 써도 호출하긴 함 
		this.setSpeed(100); // this 생략은 가능한데 써주는게 안 헷갈릴듯!  
		System.out.println(this.model + ", " + this.speed); // 얘네도 this 생략 가능 
	}
}
