package test.ch07.poly;

public class Person {
	// 필드 (클래스에서 사용하는 속성)
	public String name;
	
	// 생성자 (객체가 생성될 때 초기화를 시켜주는 역할)
	public Person(String name) {
		this.name = name; // 매개변수를 받아와서 초기값을 할당해줍니다.
	}
	
	// 메소드
	public void walk() {
		System.out.println("걷습니다.");
	}
}

