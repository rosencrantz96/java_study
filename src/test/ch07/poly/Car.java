package test.ch07.poly;

public class Car {
	// 필드로 타이어 객체 선언 (필드만 있고 객체를 넣은 것은 아닌 상태?)
	public Tire tire; // 이 상태는 선언만 한 것임. (참조타입의 변수만 만든거)
	// = new Tire(); 생성자는 안 쓴 상태 
	
	public void run() {
		// Tire tire = new Tire(); 
		tire.roll(); // 위에 객체 만들었으니까 바로 호출 가능! 
		// 타이어를 굴린다. 
	}
}
