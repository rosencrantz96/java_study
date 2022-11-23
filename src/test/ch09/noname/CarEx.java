package test.ch09.noname;

public class CarEx {

	public static void main(String[] args) {
		// Car객체 생성
		Car car = new Car();
		
		car.run1();
		car.run2();
		car.run3(new Tire() { // 익명 개체를 매개변수로 받을 때! 아래와 같이 실행.

			@Override
			public void roll() {
				System.out.println("이젠 타이어가 굴러갑니다.");
			}
			
		});
	}

}
