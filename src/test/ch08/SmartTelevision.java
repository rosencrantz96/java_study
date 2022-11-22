package test.ch08;

public class SmartTelevision implements RemoteControl2, Searchabel { // 1. 인터페이스 특징: 두 개를 동시 상속 (다중 상속: 부모가 둘이 되는 거 ㅋㅋㅋ)
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	} 
	
}
