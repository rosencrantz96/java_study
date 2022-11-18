package test.ch07;

public class ChildEX {
	
	public static void main(String[] args) {
		/*
		// 자식 객체
		Child child = new Child();
		
		// 자동 타입 변환 시에는 ★오버라이드 된 메소드를 불러온다.★ 
		Parent parent = child; // 자동 타입 변환 (부모한테 자식을 넣어주는 것) (첫 번째 방법) 
		parent.method1();
		parent.method2(); // 부모 이름으로 호출하는거지만 자식한테 있는 method2();를 불러온다. 
		// 객체 간 자동형변환이 일어났을 때, ★자식 객체에 있는 메소드는 불러오지 않는다. 
//		parent.method3(); // 컴파일에러! 
		
		parent.a = 2; // a는 부모한테 있는거니까 문제없어
		// ★자식 객체에 있는 필드는 불러오지 않는다. 
//		parent.b = 1; // b는 자식한테 있는 필드라 접근이 안 된다. 
		*/
		
		Parent parent = new Child(); // 자동타입 변환 (두 번째 방법) 
		
		// instanceof: 객체타입 확인을 위한 자바에서 제공하는 연산자 
		// parent가 Child 타입이 아니면(Child 객체를 갖고 있지 않다면) 강제 타입 변환을 할 수 없으므로 확인을 함 해보셈 
		if (parent instanceof Child) { // parent가 Child의 타입인지 물어보는 것임 
			// = parent 매개 변수가 Child 객체를 담고 있는지 묻는 것! 스바 일단 쓰긴 하는데... 이해가 되길 
		
			Child child = (Child)parent; // 강제타입 변환 (부모 변수로 받는 자식 인스턴스를 먼저 생성해줘야 함) 
			child.b = 1; // 자식 객체에 있는 필드에 접근 가능
			child.method3(); // 자식 메소드에 있는 필드에 접근 가능 	
			
		} // true일 때 코드 실행 
	}
}
