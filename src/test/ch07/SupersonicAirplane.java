package test.ch07;

// 초음속 
public class SupersonicAirplane extends Airplane {
	// 상수 (static final >< 맞췄당 ><) 
	// static: 전역변수 (공유)
	public static final int NOMAL = 1;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else { // nomal일 때는
			// super.메소드명() -> 부모 클래스의 메소드 실행
			super.fly(); // 부모 클래스의 fly() 메소드를 사용하겠다는 선언, 실행 (오버라이드 한 것이 우선순위가 된다) 
		}		
	}

	public static final int SUPERSONIC = 2;

	// 상태 필드 선언 
	public int flyMode = NOMAL;
	
}
