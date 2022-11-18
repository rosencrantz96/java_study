package test.ch07.poly;

public abstract class Animal { // 추상 클래스 생성! ^0^ (상속을 하기 위해서 만들어짐)
	// 일반 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드
	// 추상 메소드는 자식클래스에서 반드시 오버라이딩이 되어야 한다. 
	public abstract void sound();
	
}
