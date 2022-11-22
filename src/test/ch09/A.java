package test.ch09;

public class A {
	// 인스턴스 멤버 클래스 (중첩)
	// 사용 가능한 접근 제한자: public default, private 
	class B {
		// 필드
		int field1 = 1;
		
		// 생성자
		B() {
			System.out.println("B생성자 실행");
		}
		
		// 메소드
		void method1() {
			System.out.println("B의 메소드1 실행");
		}
	}
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
	
	
	/*
	// 1. 필드로 만들기 
	B field = new B();
	
	// 2. A클래스 생성자에서 사용 가능
	A() {
		B b = new B();
	}
	
	// 3. 메소드에서 사용 가능 
	void method() {
		B b = new B();
	}
	*/
}
