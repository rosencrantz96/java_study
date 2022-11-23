package test.ch10;

public class ThrowEx2 {
	
	// main메소드는 jvm에서 실행을 하고 
	// main메소드에 throws를 사용해서 예외를 떠넘기면 JVM은 예외 내용은 콘솔에 출력한다. 
	public static void main(String[] args) throws ClassNotFoundException {
		findClass(); 
	}

	public static void findClass() throws ClassNotFoundException { 
		Class.forName("java.lang.String2");
	}
}
