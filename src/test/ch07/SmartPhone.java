package test.ch07;

// 자식 클래스
public class SmartPhone extends Phone { 
	// 필드
	public boolean wifi;
	

	// 생성자
	public SmartPhone(String model, String color) {
		super(); // 부모 생성자 호출 (매개변수가 없으면 이런 식으로 써주면 된다.) 
//		super(model, color); 매개변수를 여기서 바로 넣어줘도 된다. 
		System.out.println("자식 생성자 호출"); // 이러면 부모 생성자가 먼저 실행된 후 자식 생성자가 실행된다. 
		this.model = model; // 이 부분은 부모 필드에 접근해서 값을 주는 것일 뿐임. 
		this.color = color;
	}
	/*
	public SmartPhone(String model, String color) { // 부모 클래스의 필드에서 상속받아와서 사용 가능!!!
		// 부모 클래스에서 생성자를 따로 지정해주지 않았을 때는 this.를 통해서 접근 
//		this.model = model; // 부모 필드에 접근 가능 
//		this.color = color; // 부모 필드에 초기값을 준다. 
		// 부모 클래스에 명시적으로 지정된 생성자가 있을 때 super 사용! 
		super(model, color); // 부모 생성자 호출
	}
	*/
	
	// 메소드 
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
