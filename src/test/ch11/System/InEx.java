package test.ch11.System;

import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException { // 입출력시 에러가 나면 처리하는 클래스 
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			// enter키를 읽지 않았을 때 실행하는 코드 
			if(keycode != 13 && keycode != 10) {
				if(keycode == 49) { // 숫자1키를 읽었을 경우
					speed++;
				} else if(keycode == 50) { // 숫자2키를 읽었을 경우
					speed--;
				} else if(keycode == 51) { // 숫자3
					break; // while문 나옴 
				}
				
				System.out.println("--------------------");
				System.out.println("1. 증속 2. 감속 3. 중지");
				System.out.println("현재속도= " + speed);
				System.out.println("선택: ");
			}
			keycode = System.in.read(); // 키를 하나씩 읽음 (스캐너처럼용 난 스캐너가 기억이 나지 않지만)
		}
		System.out.println("프로그램 종료");
	}

}
