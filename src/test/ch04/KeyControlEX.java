package test.ch04;

import java.util.Scanner;

public class KeyControlEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1, 2를 입력했을 때 속도를 증가, 감속시키고, 3 입력 시 종료시키는 프로그램
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1. 증속, 2. 감소, 3. 중지");
			System.out.println("----------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재속도: " + speed);
			} else if(strNum.equals("3")) {
				run = false;
				System.out.println("프로그램 종료");
//				break;  // break만나면 무조건 반복문은 중단된다.
//				continue; // continue는 완전 끝내는 것은 아님. 다시 반복문으로 올라감. 
			}
//				System.out.println("프로그램 종료"); // 때문에 이거 실행 x
			
		}
	}

}
