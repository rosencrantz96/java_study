package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) { // 인터페이스 : 다형성을 사용하면 인스턴스만 교체해서 쉽게 갈아 끼우기 가능하다! 그래서 자주 씀 
		/*
		Vechicle vechicle = new Bus(); // 자동 타입변환(형변환)
		vechicle.run();
//		vechicle.checkFare(); // 자동 형변환이 일어난 상태기 때문에 checkFare() 사용 불가. (왜냐면 자식 메소드라. 부모가 자식 메소드를 쓸 수는 없죠.)
		
		// 강제 타입변환(자식에게 부모를 넣어주는 것): 자식에게 있는 메소드나 필드를 사용할 필요가 있을 때 사용함 
		Bus bus = (Bus) vechicle; //(Bus)로 타입변환 
		bus.run();
		bus.checkFare();
	*/
		Taxi taxi = new Taxi(); // 1. 객체 생성 
		Bus bus = new Bus();
		
		ride(taxi); // 2. 매개변수로 taxi를 준다. Vechcle vechicle = new Taxi();랑 똑같음. 
					// 3. 하지만 bus 객체가 없기 때문에 실행 x
		ride(bus); // 4. 얜 bus 객체가 있으니까 checkFare() 실행 됨 
	}		

	public static void ride(Vechicle vechicle) { // Vechicle 인터페이스를 타입으로 주고 변수명 vechicle
		// vechicle이 Bus 객체를 가지고 있냐? Vechcle vechicle = new Bus(); 이런 상태인지 물어보는 것. 
		if(vechicle instanceof Bus) { // instanceof: 해당 객체를 참조하고 있는지?
			Bus bus = (Bus) vechicle; 
			bus.checkFare();
		}
	}
}
