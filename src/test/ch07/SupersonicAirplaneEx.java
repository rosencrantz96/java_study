package test.ch07;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); // "이륙"
		sa.fly(); // "일반 비행"
		// SupersonicAirplane클래스의 상수(SUPERSONIC)를 가져와서 상태 필드값 변경  
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // supersonic으로 바꿔서 출력 결과도 바뀜!!! 
	}

}
