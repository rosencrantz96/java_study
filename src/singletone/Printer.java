package singletone;

// 프린터 객체는 무조건 하나만 생성되어야 한다. 
public class Printer {
	// 필드 
	// 1. 생성자를 private로 바꿔준다. (외부에서 생성자 접근 불가하게)
	private static Printer printer = null;
	
	// 외부에서 객체 생성을 못 함! (내부에서는 가능)
	private Printer() {
		
	}
	
	// 메소드 
	// 2. 싱글톤 구현
	public static Printer getPrinter() { // 리턴타입 프린터: 프린터 객체를 받는다는 뜻
		if (printer == null) { // printer가 null이면
			printer = new Printer(); // printer 객체 생성해줌 
		} 
		
		/* 이미 printer 객체가 생성이 되어있으면
		나중에는 이미 생성된 printer가 리턴된다. */
		return printer; 
	}
}
