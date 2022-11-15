package test.ch06.exam01.pakage1;

public class B {
//	A a = new A(); // A클래스(default) 접근 가능 
	A a1 = new A(true); // ok 
	A a2 = new A(1); // ok
	A a3 = new A("문자열"); // private라서 안됨 
}
