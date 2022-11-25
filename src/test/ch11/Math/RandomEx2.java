package test.ch11.Math;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i=0; i<=5 ; i++) {
			// nextInt(n): int 타입의 랜덤한 숫자 리턴 (0 <= ~ < n) 
			System.out.print(rand.nextInt(10) + ","); // 0 ~ 9 까지의 랜덤한 숫자 생성  
		}
		
		System.out.println("");
		
		Random rand2 = new Random(100); // seed를 넣어줌 
		for (int i=0; i<=5; i++) {
			System.out.print(rand2.nextInt(10) + ",");
		}
		
	}

}
