package test.ch08;

public class MultiInterfaceEx {

	public static void main(String[] args) {
		RemoteControl2 rc = new SmartTelevision(); // 자동 형변환
		rc.turnOn();
		rc.turnOff();
		
		Searchabel searchable = new SmartTelevision();
		searchable.search("www.naver.com"); 
	}

}
