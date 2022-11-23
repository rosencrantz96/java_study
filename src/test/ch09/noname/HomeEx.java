package test.ch09.noname;

public class HomeEx {

	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		home.use2();
		home.use3(new RemoteControl() { // 매개변수로 익명개체를	주기 
			
			@Override
			public void tunOn() {
				System.out.println("뇌를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("뇌를 끕니다.");
			}
			
		
		});
	}

}
