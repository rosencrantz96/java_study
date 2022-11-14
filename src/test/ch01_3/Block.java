package test.ch01_3;


public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;

		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		
		// 블록을 기준으로 안에서 바깥걸 쓸 수는 있지만 바깥에서 안에걸 쓸 수는 없음! 에러남. 
		// 안에서는 바깥 변수에 접근 가능, 바깥에서는 안의 변수에 접근 불가능.
		//int v3 = v1 + v2 + 5; // 얘는 에러. v2에 접근 불가능함. 
		
		// \n: 줄바꿈
		System.out.printf("이름: %-6s \n","감자바"); // %s - 문자열 출력 (감자바를 받아옴) 
		System.out.printf("수량: %d \n",25); // %d - 정수 형태로 출력
		System.out.printf("실수: %10.2f \n",3.14); // %10.2f - 정수 7자리, 소수점 1, 소수 2자리를 주겠다는 의미임. 

		System.out.printf("정수출력1: %6d, 실수출력: %f",124, 3.45); // %6d - 정수를 여섯자리로 출력 (비는건 공백으로 출력! 문자열도 마찬가지. -붙으면 공백이 반대로)
		// 여러개를 쓸 수도 있다. 
		

	}

}
