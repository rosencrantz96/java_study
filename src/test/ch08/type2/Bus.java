package test.ch08.type2;

public class Bus implements Vechicle {

	@Override
	public void run() { // Vechicle 추상 메소드 오버라이드 
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() { // Bus 클래스 내의 메소드 
		System.out.println("승차요금 체크.");
	}
}
