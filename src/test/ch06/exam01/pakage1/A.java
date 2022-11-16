package test.ch06.exam01.pakage1;

//클래스는 public, default 접근 제한자를 가질 수 있다. 
public class A {
	// 필드
	public int field1; 
	int field2;
	private int field3;
	
	// 생성자
	public A() {
		field1 = 1; // 필드 호출 o
		field2 = 1; // o
		field3 = 1; // o: 전부 실행 가능 (같은 클래스 내부이기 때문에)
		method1(); // 메소드 호출 o
		method2(); // o 
		method3(); // o (마찬가지로 같은 A 클래스 내부이기 때문에 접근 가능) 
	}
	
	
	// 메소드
	public void method1();
	void method2();
	private void method3();
	
	/*
	A a3 = new A("문자열"); // private 생성자는 같은 클래스 내에서만 사용할 수 있다 
	
	public A(boolean b) {
		
	}
	A(int b) {
		
	}
	private A(String s) {
		
	}
	*/
}
