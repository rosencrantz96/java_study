package test.ch07;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class PromotionEX {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동타입변환 (부모 A에게 자식 B, C를 넣어줌) 
		A a1 = b;  
		A a2 = c; 
		A a3 = d;
		A a4 = e;
		
		B b3 = e; // 컴파일 에러! 왜냐면 B와 C는 상속 관계에 있지 않기 때문에. 자동타입변환 불가! 
		C c2 = d; // 마찬가지로 상속 관계에 있지 않기 때문에 자동타입변환 불가. depth가 깊어질 수록 그림을 그려서 상속 구조를 확인하는 것이 좋다. 
	}

}
