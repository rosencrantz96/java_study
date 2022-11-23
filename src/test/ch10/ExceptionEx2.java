package test.ch10;

public class ExceptionEx2 {

	public static void main(String[] args) { // 일반 예외: try catch문 반드시 필요로 함! (실행 예외는 굳이 안써도 상관은 없음)
		try {
			Class.forName("java.lang.String2"); // 주어진 클래스를 찾는 코드
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		} 
	}

}
