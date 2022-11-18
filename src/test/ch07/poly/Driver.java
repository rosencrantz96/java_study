package test.ch07.poly;

public class Driver {
	// 메소드 (매개변수로 다형성을 구현한다.)
	public void driver(Vehicle vehicle) { // 매개변수로 객체를 받아온다. (타입, 변수)
//		Vehicle vehicle = new Bus();
		vehicle.run(); // 받아와서 run() 메소드 실행 (구현 끝)
	}
}
