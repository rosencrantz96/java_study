package test.ch04;

public class While_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0; // 1. 결과값을 담을 변수를 만들어준다! 
		
		// 1~100 까지 합계

		while (i <= 100) {
			sum += i; // 2. 합계 구하는 식 
			i++;
		}

		System.out.println(sum); // 3. 결과 출력 

		
		do { // do는 일단 실행 먼저 시키는 것! 
			i++;
			System.out.println(i);
		} while (i<=10);
	}

}
