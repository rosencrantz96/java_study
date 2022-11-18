package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A {
	// 생성자
	public D() {
		super(); // A클래스의 생성자 호출 
	}
	
	public void method1() {
		super.field = "1";
		super.method();
		
		this.field = "1"; // 어차피 부모꺼가 다 내꺼가 되기 때문에 this.를 통해서도 쓸 수 있다. 
		this.method();
	} 
	
	public void method2() {
		// protected 사용 시 직접 객체를 생성해서 사용할 수는 없다. 
		A a = new A(); // 접근 불가 
		a.field = "1"; // 접근 불가 
		a.method(); // 접근 불가  
	}
	
}
