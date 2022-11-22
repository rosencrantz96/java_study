package test.ch08.test05;

public class TV implements Remocon {

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new TV(); // 자동형변환 
		r.powerOn(); 
	}

	

}
