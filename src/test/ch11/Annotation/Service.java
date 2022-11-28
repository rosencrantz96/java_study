package test.ch11.Annotation;

public class Service {
//	// 필드 
//	String test;
//	
//	// 생성자 
//	public Service() {}

	// 메소드 (어노테이션 적용하고 싶은거 위에 @ 써주기)
	@PrintAnnotation 
	public void method1() {
		System.out.println("method1");
	}
	
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");
	}
	
	@PrintAnnotation(value="#", number=20) // 속성 
	public void method3() {
		System.out.println("method3");
	}
}
