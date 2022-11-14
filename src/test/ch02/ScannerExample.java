package test.ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체의 이름을 먼저 써야 함! 그 다음 객체를 받아올 변수의 이름 씀. = 객체 생성 방법은 js와 같음
		Scanner scanner = new Scanner(System.in);

		System.out.println("x값 입력: ");
		String strX = scanner.nextLine(); // nextLine 메소드의 역할: enter키를 누르면 문자열을 읽는다.
		int x = Integer.parseInt(strX); // 입력받은 값을 강제적으로 정수형으로 형변환

		System.out.println("Y값 입력: ");
		String strY = scanner.nextLine(); // nextLine 메소드의 역할: enter키를 누르면 문자열을 읽는다.
		int y = Integer.parseInt(strY); // 입력받은 값을 강제적으로 정수형으로 형변환

		int result = x + y;
		System.out.println("result " + result);
		System.out.println();

		while (true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();

//			if (dataString === "q") javascript
			
			if (data.equals("q")) { //입력받은 데이터가 q인가?
				break;
			}
			
			System.out.println("출력 문자열: " + data);
			System.out.println();
			
		}
		
		System.out.println("종료");
	}

}
