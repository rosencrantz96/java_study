package test.ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'a'; 

		// &: 둘 다 참이어야 하는데... 일단 앞의 피연산자가 false여도 뒤의 연산자까지 연산을 하긴 함. 
		if ((65 <= charCode) & (charCode <= 90)) { // 65~90
			System.out.println("대문자이군요.");
		}
		
		//&&: 얘는 앞의 피연산자가 false면 뒤에 것도 연산하지 않음. 
		if ((97 <= charCode) && (charCode <= 120)) { // 97~122
			System.out.println("소문자이군요.");
		}
		
		if ((48 <= charCode) && (charCode <= 57)) { // 48~57
			System.out.println("0~9 숫자군요.");
		}
		
		int value = 6;
		
		// 
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}
		
		// 앞의 피연산자가 true면 뒤에 안 봄. (어차피 하나만 맞으면 true니깐!) 두 개짜리 연산자가 더 효율적이다. 
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}
		
		
	}

}
