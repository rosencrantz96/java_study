package test.ch06;

public class CalculatorEX {

	public static void main(String[] args) { // public: 어디에서나 접근 가능, static: 인스턴스가 없어도 메인 메소드 실행 가능하게 해 줌, main: static 메소드 
		// 객체랑 인스턴스는 비슷한 말이지만! 
		// 필드 메소드 -> 객체를 사용해야만 접근할 수 있다
		
		Calculator myCalc = new Calculator(); // 인스턴스: 객체를 할당받은 상태... myCalc는 인스턴스에 해당 
		
		// 리턴을 받을 매개변수를 만들어준다. 타입 쓰고 result1
		double result1 = myCalc.areaRectangle(10); // 메소드에 여기서 준 매개변수 10이 들어감! 
		System.out.println(result1);
		
		double result2 = myCalc.areaRectangle(10, 20); // 10은 width에, 20은 height에 들어감! 
		System.out.println(result2);
		
		
		/*
		Calculator myCalc = new Calculator(); // 생성자는 알아서 만들어짐. 메소드만 이용하면 됨. (필드에서 가져옴)
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6); // 받아올 변수 = 5, 6을 x, y에...!
		System.out.println(result1);
		
		int x = 10, y = 4; // 자동형변환 일어난다! (타입 주의) 
		double result2 = myCalc.divide(x, y); // 
		System.out.println(result2);
		
		myCalc.powerOff();
		*/
	}

}


