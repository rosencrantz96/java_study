package test.ch15.lamda;

public class LamdaEx {

	public static void main(String[] args) {
		/*
		 //익명구현객체
		action(new Calculable() { // 하위클래스 + 오버라이드
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x+y);
			}
		});
		action(new Calculable() { // 하위클래스 + 오버라이드
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x-y);
			}
		});
		*/
		// 람다식은 인터페이스를 보고 만들면 됩니다. 
		// 람다를 쓰면!! 코드 길이가 확 줄어들어욧!! 짱이죠!! 위에 주석 해놓은게 이렇게 줄어든 것임 
		action((x, y) -> { // 추상메소드에 매개변수가 없으면 여기도 괄호만 쓰면 됨 
			System.out.println(x+y);
		});
		
		action((x, y) -> System.out.println(x-y)); // 실행문이 한 줄일 때는 중괄호 생략 가능 
		
		// 매개변수가 하나일 땐 괄호 생략 가능 
//		action(x -> System.out.println(x));
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculate(x, y);
	}

}
