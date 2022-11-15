package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
//	A a = new A(); // A클래스(default)(public을 안 쓴 경우) 접근 불가 (import 해도 안 됨) 
//	B b = new B(); // B클래스(public)은 어디서든지 접근 가능 (import 해주면 됨)
	
	A a1 = new A(true); // ok 
//	A a2 = new A(1); // X 패키지가 다르기 때문에 에러가 난다 (A클래스는 default니까)
//	A a3 = new A("문자열"); // X	(얘는 private 라서 에러남)

}
