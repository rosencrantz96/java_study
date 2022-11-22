package test.ch08.interface_extends;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl; // 자동 형변환
		ia.methodA();
//		ia.methodB(); // 에러
//		ia.methodC(); // 에러 (이유: InterfaceA는 추상메소드로 methodA밖에 없으니깐
		
		InterfaceB ib = impl; // 자동 형변환
		ib.methodB();
		
		InterfaceC ic = impl; // 자동 형변환
		// ★ InterfaceC는 InterfaceA, InterfaceB를 상속을 받았으므로 아래와 같이 호출 가능
		ic.methodA(); // InterfaceA와 InterfaceB의 추상메소드를 모두 가져올 수 있다. 
		ic.methodB();
		ic.methodC();
		
	}

}
