package test.ch06.question;

public class Member {
	// 필드
	String name;
	String id;
	String password;	
	int age;

	// 생성자 (클래스명이랑 똑같이 만들면 됨... 어려워잉)
	// 초기화를 시켜주는 곳이다!  
	Member(String name, String id) { // 매개변수에 형이 없으면 에러납니다! 
		this.name = name;
		this.id = id;
	}
}


