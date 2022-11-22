package test.ch09;

public class AEx {

	public static void main(String[] args) {
		A a = new A();
		a.useB();
		
		/*
		// 외부에서 B클래스 사용하기
		A a = new A();
		
		// 중첩 클래스는 A를 통해서 들어가야 한다! (당연함 A안에 있음)
		A.B b = a.new B();
		*/
		
		// 중첩클래스: 접근하기 편하다는 장점~ 외부에서 볼 때 불필요한 관계 클래스를 감출 수 있다? 
	}

}
