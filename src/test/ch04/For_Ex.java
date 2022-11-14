package test.ch04;

public class For_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
//			sum = sum +i
			sum += i;
		}
		
		System.out.println("sum=" + sum); //for문 바깥에서 합계 찍어봐야 함! 안에서는 그냥 반복되는 수만 찍힘.
		
//		for(float x=0.1f; x<=1.0f; x+=0.1f) {
//			System.out.println(); // 부동소수점은 잘 씀
//		}
		
		for (int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
		
		
		// js와는 다르게 중복해서 쓸 수 있는데(int i=1, j=1) 조건식은 하나만 써야 함. (연산자 사용하면 ㄱㅊ) 
		/*
		int j = 0;
		for (int i=1; i<=10 && j <=10; i++, j++) {
//			System.out.println(i);
			System.out.println(j);
		}
		*/
		
		
	}

}
