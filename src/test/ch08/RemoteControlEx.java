package test.ch08;

public class RemoteControlEx {

	public static void main(String[] args) {
		/*
		// 객체를 생성한 다음 넣어주세욧. 
		RemoteControl rc = new Television(); // 인터페이스를 할 때는 처음부터 사용할 때 자동형변환을 해서 쓰세욧. 
		// 바로 실행!! 
		rc.turnOn();
		// 다형성과 원리가 아주 똑같습니다!!! 이름이 인터페이스고 추상메소드가 추가된 것이 다를 뿐
		// (RemoteControl이 부모고 자동형변환을 함. 그리고 turnOn을 호출합니다. 
		// 오버라이드 된 애를 출력함!!!
		
		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		// 이렇게도 해줄 수 있지만... 인터페이스는 아래처럼 더 효율적으로 할 수 있다!!! 
 		*/
		
		
		RemoteControl rc;
		/*
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio(); // rc를 new Audio()로 바꿔 끼웠다! 오! 더 편하다! (같이 상속을 받고 있기 때문에 교체가 당연한 거임. 당연함.) 
		rc.turnOn();
		rc.setVolume (5);
		rc.turnOff();
		
		// 상수 호출: 인터페이스명을 써주고 호출하면 됨. 
		// static의 특성을 가졌기 때문에 객체를 생성하지 않고도 호출한다. 
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		*/
		
		rc = new Television(); // 자동형변환 일어난 것임(그래서 부모꺼 다 사용 가능)
		rc.turnOn();
		rc.setVolume(15); // 오버라이드 된 걸 사용함. 무조건. 
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("============");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
	}

}
