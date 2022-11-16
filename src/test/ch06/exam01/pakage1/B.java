package test.ch06.exam01.pakage1;

public class B {
	public void method() {
		A a = new A(); // 객체 생성
		
		a.field1 = 1; // 필드 호출 o
		a.field2 = 1; // o
		a.field3 = 1; // x (private 필드는 오로지 같은 클래스 안에서만 실행 가능)
		a.method1(); // 메소드 호출 o
		a.method2(); // o 
		a.method3(); // x (private 메소드 역시 같은 클래스 안에서만 실행 가능)
	}

	
	
	
	/*
//	A a = new A(); // A클래스(default) 접근 가능 
	A a1 = new A(true); // ok 
	A a2 = new A(1); // ok
//	A a3 = new A("문자열"); // private라서 안됨 
	*/
}
