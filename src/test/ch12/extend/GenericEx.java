package test.ch12.extend;

public class GenericEx {
	//제한된 타입 파라미터 (타입을 제한하는 것임니다)
	public static <T extends Number> boolean compare(T t1, T t2) { // 리턴 타입 앞에다가 무조건 <> 써주세용
		// extends Number...!!! 얘가 오면서 Number의 하위 클래스를 전부 사용할 수 있게 되었다!!! 짱 
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2); // 리턴타입이 정해져있으면 매개변수에만 적용됨 
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(10, 20);
		System.out.println(result1); //false

		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2); //true
	}

}
