package test.ch07.package1;

public class B {
	public void method() {
		A a = new A(); // 접근 가능 
		a.field = "1"; // 접근 가능 
		a.method(); // 접근 가능 (이유 - 같은 패키지에 존재하기 때문이다.) 
	}
}
