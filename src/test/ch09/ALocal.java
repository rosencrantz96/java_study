package test.ch09;

public class ALocal {
	void useB(int arg) { // = final int arg
		
		// 함수 내부에서 쓰이는 로컬변수 
		int var = 1; // = final int var 
		
		class B {
			// 인스턴스 필드
			int field1 = 1;
			
			// 생성자
			B() {
				System.out.println("B생성자 실행");
			}
			
			// 인스턴스 메소드
			void method1() {
				System.out.println("B메소드 실행");
			}
			
			void method2() {
//				arg = 2; 
//				var = 2; // 컴파일 에러: 중첩 클래스의 안에서는 바꿀 수 없음
			}
			
 		}
		
		//메소드 안에서 로컬 객체 생성 
		B b = new B(); // 메소드 안에서 실행해줘야 한다 (메소드 안에서 클래스를 만들었기 때문에 메소드 안에서 객체를 생성해야 한다)
		System.out.println(b.field1);
		b.method1(); // 1. 내부 호출은 이렇게 하면 된다. 
	}
	
 }
