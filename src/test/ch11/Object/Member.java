package test.ch11.Object;

public class Member extends Object { 
	// 필드
	public String id;
	
	// 생성자
	public Member(String id) {
		this.id = id;
	}

	// 논리적 동등 만들기: 객체의 주소와 상관 없이 필드의 값으로 비교 
	@Override
	public boolean equals(Object obj) {
		// obj가 Member 객체를 가지고 있냐? (
		if (obj instanceof Member) { // 강제 형변환을 하기 위해 검사
			Member target = (Member) obj; // 강제 형변환: 자식 객체에 있는 필드를 가져왹 위해  
			
			if(id.equals(target.id)) { // 여기서의 equals은 String의 equals(순수하게 문자값 비교)
				return true;	
			}
		}
		
		return false;
	};
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		Object obj1 = new Object(); // Object도 클래스기 때문에 객체를 만들 수 있다.
		Object obj2 = obj1;
		
		System.out.println(obj1.equals(obj2)); // true! 번지수를 비교 Object 안에 eqauls()가 있어서 오버라이드 가능
		System.out.println(obj1 == obj2); // true! 번지수를 비교 
		
		String a = "1";
		String b = "2";
		
//		if (a == b) // x : 주소를 비교 
//		if (a.equals(b) //  o : 실제 값을 비교
		// 논리적 동등: 같은 객체든 다른 객체든 객체 저장 데이터가 동일하다.
	}
	*/

}
