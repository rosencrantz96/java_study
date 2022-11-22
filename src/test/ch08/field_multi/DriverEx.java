package test.ch08.field_multi;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver(); // 객체 생성
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus); // [버스가 달립니다.] 1. 이게 실행되면 → Driver 클래스로 고고 
		driver.driver(taxi); // [택시가 달립니다.]
		
		
 	}

}
