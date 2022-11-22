package test.ch08.field_multi;

public class Car {
	// 필드
	Tire tire1 = new HankookTire(); // 자동 형변환
	Tire tire2 = new HankookTire();
			
	// 메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
