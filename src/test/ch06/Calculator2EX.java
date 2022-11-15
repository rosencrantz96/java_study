package test.ch06;

public class Calculator2EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator2 calc2 = new Calculator2(); // 객체 생성 =(완전 같은건 아닌데 비슷) ★인스턴스 생성 (실제로 생성된 객체)
		// ★인스턴스 멤버는 내가 생성한 인스턴스를 통해서만 들어갈 수 있음 (인스턴스를 통하지 않고선 절대 실행시킬 수 없다!) 
//		calc2.pi = 10;
//		calc2.plus(1, 2); //원래는 무조건 이렇게 해야만 접근할 수 있었음. 
		
		//static을 붙인 멤버는 정적 멤버라고 함! 
		Calculator2.plus(1, 2); // 정적멤버는 클래스명.메소드() 이렇게 불러오면 인스턴스를 생성하지 않아도 접근 가능! 
		Calculator2.minus(1, 2); // 객체(인스턴스)를 생성하지 않아도 클래스를 통해서 접근 가능.  
		System.out.println(Calculator2.pi); // 클래스명.필드도 이렇게 접근할 수 있음 
		
	}

}
