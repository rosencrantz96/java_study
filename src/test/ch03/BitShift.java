package test.ch03;

public class BitShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		// 좌측 이동 연산자 : 2진수 변환 -> 3칸 왼쪽으로 밀고 빈 공간은 0으로 채움 
		// 2의 거듭제곱을 곱한 값과 같다. 
		int result = num1 << 3;
		System.out.println(result);
	
		
		int num2 = -8;
		// 우측 이동 연산자 : 2진수 변환 -> 3칸 오른쪽으로 밀고 빈 공간은 1으로 채움 
		// 2의 거듭제곱을 나눈 값과 같다. 
		int result2 = num2 >> 3;
		System.out.println(result2);
	
		// 연산은 내가 안 함!!!!!! 논리만 알고 있으면 됨. 
	}

}
