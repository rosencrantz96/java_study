package test.ch07.poly;

public class DriverEX {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver객체를 생성한다. 
		
		Bus bus = new Bus();
		driver.driver(bus);	
		
		Taxi taxi = new Taxi();
		driver.driver(taxi); // Driver 객체의 drive 함수에 taxi 객체를 매개변수로 준다. 
		// 갈아 끼우기만 하면 되니까 아주 편리하다고 함.
	}

}
