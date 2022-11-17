package test.ch07;

public class SmartPhoneEX {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰XR", "흰색");
		
		//Phone에서 상속받은 필드 읽기: 자식 객체에도 부모 필드에 접근 가능
		System.out.println(myPhone.model + ", " + myPhone.color);
		
		
		//phone에서 상속받은 메소드: 자식 객체에서 부모 메소드에 접근 가능 
		myPhone.bell();
		myPhone.sendVoice("가제트루나씨인가요?");
		myPhone.receiveVoice("네 마씁니다");
		myPhone.hangUp();
		
		myPhone.setWifi(false);
		System.out.println(myPhone.wifi);
	}

}
