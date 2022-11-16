package test.ch06;

public class GetSetEX {

	public static void main(String[] args) {
		// 클래스에 대한 인스턴스 생성 
		GetSet getset = new GetSet();
		
		// setSpeed메소드에 접근 -> private 필드에 간접 접근 가능하게 됨 
		getset.setSpeed(30);
		System.out.println(getset.getSpeed()); // 30 (수정하고 값을 가져올 수 있다) 
		
		if(!getset.isStop()) { // 달리고 있을 때
			getset.setStop(true); // 멈춤 (GetSet 클래스에서 stop을 줬고 true 값이니까 0이 나옴 
			System.out.println(getset.getSpeed()); // 0 
		}
		
	}

}
