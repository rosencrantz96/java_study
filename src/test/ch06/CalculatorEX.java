package test.ch06;

public class CalculatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator(); // 생성자는 알아서 만들어짐. 메소드만 이용하면 됨. (필드에서 가져옴)
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6); // 받아올 변수 = 5, 6을 x, y에...!
		System.out.println(result1);
		
		int x = 10, y = 4; // 자동형변환 일어난다! (타입 주의) 
		double result2 = myCalc.divide(x, y); // 
		System.out.println(result2);
		
		myCalc.powerOff();
	}

}


