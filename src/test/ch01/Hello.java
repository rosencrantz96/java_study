package test.ch01;

public class Hello {

	public static void main(String[] args) {
		// main 안에 있는게 가장 먼저 실행된다. (없으면 오류남!)
		// 실행시키고 싶은 코드는 main 안에 쓰면 된다! 
		// ;(세미콜론) 꼭! 반드시 써야 함!
		// 주석1 : //  (한 줄 주석! 단축키: 'ctrl+/')  
		// 주석2 : /* */ (여러 줄 주석! 여기까지 자바 스크립트랑 똑같음) 
		// 주석3 : /** **/ (api 도큐먼트 작성할 때 사용. 설명을 길게 달아야 할 때!) 
		// TODO Auto-generated method stub
		System.out.println("hello! java!"); // ln이 붙으면 라인 바꿔주는거임 
		// a 라는 변수를 입력한 순간 메모리 공간에 '번지'가 생기는 것. 그리고 10이라는 값을 입력하면 a라는 메모리 번지에 저장?
		// 변수: 하나의 값을 저장할 수 있는 메모리의 번지수 이름... 이라고 이해해 보세요.
		// int: 변수 타입(자료형), a: 변수, 10: 리터럴 (사용자가 입력한 값? - 프로그램에서 사용하는 모든 숫자, 문자, 논리값)
		
		/* 
		int a = 10, b = 12;
		int result = a * b;
		int num = 0; 
		
		System.out.println("결과:" + result);
		System.out.println(a + num);
		*/
		
		/*
		int a = 128;
		int b = 40000;
		int c = 300;
		*/
		
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수
		long var5 = 1000000000L;
		long var6 = 1000000000l;
		char c1 = 'A'; // 캐릭터(문자) 타입! 작은 따옴표, 문자 1개
		char c2 = 44032; // 유니코드
		
		// float var7 = 0.12331423f;
		float var7 = 0.2343154235F;
		double var8 = 0.2343154235;
		double var9 = 3e6; // 3.0 * 10^6
		double var10 = 2e-3; // 2.0 * 10^-3
		float var11 = 3e6f; // 3.0 * 10^6
		
		// 10진수 출력
		// System.out.println(var1 + ":" + var2 + ":" + var3 + ":" + var4);
		// System.out.println(var6);
		// System.out.println(var7 + ", " + var8);
		// System.out.println(var9);
		// System.out.println(var10);
		// System.out.println(var11);
		
		boolean stop = true;
		
		int x = 10;
		boolean result1 = (x == 20);
		
//		System.out.println(stop);
//		System.out.println(result1);
//		
//		if (stop) {
//			System.out.println("정지합니다.");
//		}
//		
		String name = "나는 \"김하서\" 입니다."; // 큰 따옴표, 문자 1개 혹은 여러개 // '\': escape문자 (여러개 있음)
		String one = "A";
		
		System.out.println(name);
		System.out.println(one);

		
		//정리 문제 
		System.out.println("1"+"2");
		System.out.println('A'+'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+"ava");
	}

}
