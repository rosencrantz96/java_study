package test.ch07;

// 부모 클래스
public class Phone { // 클래스 = 설계도 (new를 만들기 전까진 실존하지 않는 것)
	// 필드
	public String model; // 모델명
	public String color; // 컬러
	
	// 생성자
	public Phone() {
		System.out.println("부모 생성자 실행");
	}
	/*
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	*/
	
	
	// 메소드
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기 목소리: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 목소리: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
