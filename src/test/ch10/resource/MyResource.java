package test.ch10.resource;

// AutoCloseable: 리소스를 자동으로 닫아주는 기능을 사용하기 위해서 쓰는 인터페이스 
public class MyResource implements AutoCloseable { // 파일의 이름을 받는 순간 생성자가 실행됨 
	// 필드 
	private String name;
	
	// 생성자
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource" + name + "열기");
	}
	
	// 메소드
	public String read1() {
		System.out.println("MyResource" + this.name + "읽기");
		return "100";
	}
	public String read2() {
		System.out.println("MyResource" + this.name + "읽기");
		return "abc";
	}

	@Override
	public void close() throws Exception { // 닫아주는 메소드 (finally를 사용하지 않아도 됨)
		// 파일을 닫을 때 실행하고 싶은 코드를 작성
		System.out.println("MyResource" + this.name + "닫기");
		System.out.println("------------------");
	}
}
