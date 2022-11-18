package test.ch07.package2;

public class C {
	A a = new A(); // 접근 불가  
	a.field = "1"; // 접근 불가
	a.method(); // 접근 불가 (이유 - 패키지가 다르기 때문이다.) 
}
