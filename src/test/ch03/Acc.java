package test.ch03;


public class Acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int apple =1 ;
		double pieceUnit = 0.1; 
		int number = 7;
		
		// 정확한 계산은 항상 정수로 해야 한다! double이라서 아래와 같은 결과가 나옴. 
		double result = apple - number * pieceUnit; // apple(1) - 0.7(* 연산자 우선 계산) 
		System.out.println("사과 1개에서 남은 양: " + result); // 결과: 0.29999999999999993
		*/
		
		/*
		int apple =1 ;
		int totalPiece = apple * 10; 
		int number = 7;
		
		// 정확한 계산은 항상 정수로 해야 한다! 
		int result = totalPiece - number; 
		System.out.println("사과 1개에서 남은 양: " + result/10.0); // 소수로 표현하고 싶다면 정수로 계산 후에 후처리를 해주기. (강제형변환이나 소수처리 따로) 
		*/
		
//		int x = 5;
//		int y = 0;
//		int result = 5 / 0; // 0으로 나누면 'by zero'라는 exception 에러 
//		System.out.println(result);
		
		int x = 5;
		double y = 0.0;
		double z = x / y; 
//		double z = x % y;
		System.out.println(z + 2); // /연산에서는 Infinity라는 결과! 연산 안 됨. %연산에서는 NaN이라는 결과! (숫자 아님)  
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z);
		}
			

		
		
		
		
		
	
	}

}
