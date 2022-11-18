package test.ch07.poly;

public class CarEX {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// Tire 객체를 넣어준다. 
		myCar.tire = new Tire(); // 3. 그래서! 여기에서 객체를 넣어주면 됨! 그러면 run(); 이 실행이 된다. 
		myCar.run(); // 1. 원래 이렇게 하면 됐는데... 이렇게만 하면 에러가 납니다. 
		// 2. 이유! 필드 선언만 되어 있고 필드에 객체가 들어있지 않기 때문임. 
		
		myCar.tire = new HankookTire(); // 자동타입변환이 일어나서 오버라이딩한 메소드 호출됨!! 
		myCar.run(); // "한국타이어가 빠르게 회전합니다" 출력 
		// 코드 한 줄만 바꾸면 뭘 바꿀 수 있으니까 효율성 개좋음 
		
		myCar.tire = new KumhoTire(); // 자동타입변환이 일어나서 오버라이딩한 메소드 호출됨!! 
		myCar.run(); // "금호타이어가 느리게 회전합니다" 출력 
		
	}

}
