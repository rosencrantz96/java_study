package test.ch11.Wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2); // false 객체 주소 비교 (주소는 당연히 다름)
		System.out.println(obj1.equals(obj2)); // true 값을 비교 
		System.out.println();
		
		/*
		 * [값을 비교하는 타입]
		Boolean
		Character
		Byte, Short, Int : -128 ~ 127 
		*/
		
		Integer obj3 = 10; 
		Integer obj4 = 10;
		System.out.println(obj3 == obj4); // 여기선 예외로 그냥 값을 비교하게 되기 때문에 true
		System.out.println(obj3.equals(obj4)); // true
	}

}
