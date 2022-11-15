package test.ch06.exam01.pakage1;

//클래스는 public, default 접근 제한자를 가질 수 있다. 
public class A {
	A a3 = new A("문자열"); // private 생성자는 같은 클래스 내에서만 사용할 수 있다 
	
	public A(boolean b) {
		
	}
	A(int b) {
		
	}
	private A(String s) {
		
	}
}
