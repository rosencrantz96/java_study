package test.ch08.field_multi;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car(); // Car에 대한 객체 생성
		myCar.run(); // [한국 타이어가 굴러갑니다 한국 타이어가 굴러갑니다]
		
		// 타이어 객체 교체 (기본 디폴트 값으로는 한국타이어를 박아놓고 다른거로 교체)
		myCar.tire1 = new KumhoTire(); // 바꾸는 건 뒤에 객체만 바꿔주면 됨!
		myCar.tire2 = new KumhoTire(); // 금호로 교체! 
		
		myCar.run(); // 바뀐 내용 출력됨 [금호 타이어가 굴러갑니다 금호 타이어가 굴러갑니다]
	}

}
