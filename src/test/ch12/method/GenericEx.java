package test.ch12.method;

public class GenericEx {
	// 제네릭 메소드
	public static <T> Box<T> boxing(T t) { // 제네릭 메소드니까 타입파라메터 붙이고 리턴타입 Box<T> 매개변수
		Box<T> box = new Box<T>(); // 아직 타입이 정해지지 않은 상태 
		box.set(t); // 매개변수로 받는 t를 넣어줌 
		return box; // 그리고 리턴~(박스 객체 리턴)
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출: T를 Integer로 대체 (모든 T의 자리를 대체한다고 생각하세요)
		Box<Integer> box1 = boxing(100); // Integer라는 타입파라메터를 줘서 t는 100이되고 Box 객체생성 
		int intValue = box1.get(); // 강제형변환 필요 없이 바로 가져올 수 있당 제네릭 짱
		System.out.println(box1.get()); 
		System.out.println(intValue);
		
		Box<String> box2 = boxing("추운날"); // boxing 메소드 실현하는 순간 객체가 생성되고 메소드 set메소드 호출
		String strValue = box2.get();
		System.out.println(strValue);
		
	}

}
