package test.ch09.noname;

public class Home {
	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void tunOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	};
	
	public void use1() {
		rc.tunOn();
		rc.turnOff();
	}
	
	// 메소드(로컬 변수 이용)
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void tunOn() { // 이름없는 클래스 + 상속 + 자동형변환 
				System.out.println("에어컨을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
			
		};
		
		rc.tunOn();
		rc.turnOff();
		
	}
	
	// 메소드(매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.tunOn();
		rc.turnOff();
	}
}

