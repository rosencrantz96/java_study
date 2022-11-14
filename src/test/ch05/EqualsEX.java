package test.ch05;

public class EqualsEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String은 리터럴이 같으면 같은 주소를 가리킨다
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1와 strVar2는 참조가 다름");
		}
		
		// 값을 비교할 땐 equals 함수를 사용
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1와 strVar2는 문자열이 같음");
		}
		
		// new로 생성하면 같은 값이라도 가리키는 주소가 다르다. 
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3와 strVar4는 참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strVar4는 문자열이 같음");
		}
		
	}

}
