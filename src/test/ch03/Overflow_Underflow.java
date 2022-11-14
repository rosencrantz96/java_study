package test.ch03;

public class Overflow_Underflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125; // byte 타입은 127까지만 표현 가능 (-128~127)
		// 오버플로우: 타입이 허용하는 최대값을 벗어나는 것 
		
		for(int i =0; i < 5; i++) { // 초기값; 조건식 ; 증가식 ! 자바스크립트랑 똑같음 
			var1++;
			System.out.println("var1: " + var1); // 가장 작은 값으로 돌아가서 (-128) 증가함 
		}
		
		byte var2 = -125; // byte 타입은 127까지만 표현 가능 (-128~127)
		// 언더플로우: 타입이 허용하는 최소값을 벗어나는 것 
		
		for(int i =0; i < 5; i++) { 
			var2--;
			System.out.println("var2: " + var2); // -128까지 찍고 최대값으로 돌아가서 (127) 다시 거기서부터 하나씩 감소함 
		}
	}
}
