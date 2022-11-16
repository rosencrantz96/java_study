package test.ch06;

public class ThisEX { 

	public static void main(String[] args) { // 메인에서 실행
		// 자동차 객체 (각각 서로 다른 두 객체)
		This myCar = new This("포르쉐");
		This yourCar = new This("벤츠");
		
		myCar.run(); // 포르쉐, 100
		yourCar.run(); // 벤츠,100
	}

}
