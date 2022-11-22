package test.ch08.field_multi;

public class Driver {
	void driver(Vehicle vehicle) { // 매개변수에 객체 (데이터 타입, 변수명) 
		// 2. 여기에 버스 객체가 매개변수로 들어오는것과 마찬가지 
		vehicle.run(); // 3. vehicle에 bus가 들어온거니까 오버라이드 된 run() 메소드가 실행되는 것 
		
		// 이거시... 다형성. 존나 중요합니다. 
	}
}
