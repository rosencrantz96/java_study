package test.ch11.Object;

public class EqualsEx extends Object {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		} // [출력] 다릅니다 (주소 비교) / 같습니다 (equals 오버라이드를 후엔 순수한 글자 비교)
		
		if (obj1.equals(obj3)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}

}
