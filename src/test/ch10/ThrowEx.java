package test.ch10;

public class ThrowEx {
	
	public static void main(String[] args) {
		try {
			findClass(); // 메소드를 호출한 곳에서 예외처리 발생 
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
	}

	public static void findClass() throws ClassNotFoundException { // 예외 떠넘기기: 메소드 뒤에 throw 붙이면 됨 
		Class.forName("java.lang.String2");
	}
}
