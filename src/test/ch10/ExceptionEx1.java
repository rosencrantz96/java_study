package test.ch10;

public class ExceptionEx1 {

	public static void printLength(String data) {
		try {// 실행시킬 코드를 작성 
			int result = data.length(); 
			System.out.println("문자 수: " + result);
		} catch (NullPointerException e) { // 에러가 났을 때 실행시킬 코드를 작성 (클래스이름(타입):NullPointerException 변수:e)
			
			// 예외 처리 정보를 얻는 세 가지 방법 
//			System.out.println(e.getMessage()); // 1. 에러메시지 출력: Cannot invoke "String.length()" because "data" is null 
			// → 예외가 발생한 이유만 리턴
//			System.out.println(e.toString()); // 2. 메시지: java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
			// → 예외의 종류 + 예외가 발생한 이유 리턴
			e.printStackTrace(); // 3. 메시지: java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
			// at test.ch10.ExceptionEx1.printLength(ExceptionEx1.java:7)
			// at test.ch10.ExceptionEx1.main(ExceptionEx1.java:26)
			// → 예외의 종류 + 예외가 발생한 이유 + 예외가 발생한 곳 리턴
		} finally { // 에러 여부와 상관 없이 마지막에 무조건 실행 되는 코드, 옵셔널 (없어도 됨)
			System.out.println("마무리 실행\n");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null); // 예외 처리를 해주지 않으면 에러: Cannot invoke(부르다) "String.length()"
		System.out.println("프로그램 종료\n");
	}

}
