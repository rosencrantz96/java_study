package test.ch09;

public class ALocalEx {

	public static void main(String[] args) { 
		ALocal a = new ALocal();
		
		//메소드 호출을 통해서 객체를 생성
		a.useB(); // 2. 외부 호출은 이렇게: useB() 안에 객체가 있으니까 그게 호출됨 
	}

}
