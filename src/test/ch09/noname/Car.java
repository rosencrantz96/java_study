package test.ch09.noname;

public class Car {
	// 필드에 Tire객체 대입
	// 필드에서 익명 자식 객체 사용 
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { // 이름없는 클래스를 만들고 동시에 상속이 된다고 생각하면 된다! 
		// 괄호 안: 이름없는 클래스 + 상속 (오버라이드 가능) + 자동 형변환  
		// 이름이 없는 자식 객체가 들어오는 거라고 생각하면 편하다 

		@Override
		public void roll() {
			System.out.println("한국 타이어가 굴러갑니다.");
		}
		
	};

	// 메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		// 로컬 변수에 익명 자식 객체 사용 
		Tire tire = new Tire() { // 이름없는 클래스 + 상속 (오버라이드 가능) + 자동 형변환 

			@Override
			public void roll() {
				System.out.println("금호 타이어가 굴러갑니다.");
			}
			
		}; 
		
		tire.roll();
	}
	
	// 메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
