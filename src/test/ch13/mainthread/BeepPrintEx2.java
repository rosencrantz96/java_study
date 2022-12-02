package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx2 { // 멀티 쓰레드

	public static void main(String[] args) {
		// Runnable: 스레드 실행을 위한 인터페이스 
		Thread thread = new Thread(new Runnable() {
			//run(): 동시에 일어나야 하는 일을 정의하는 것. (실제로 동시는 아니지만 동시에 나오는 것 처럼 보이게 하려고) 
			@Override 
			public void run() { 
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep(); // 빔소리를 냄 
					try {
						Thread.sleep(500); // 0.5초 간 일시정지 
					} catch (Exception e) {}
				}		
			}}); // 여기까지는 구현만 한 거고 
		
		thread.start(); // 실행은 start()로 해줘야 함 
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5초 간 일시정지 
			} catch (Exception e) {}
		}
	}
	
	// 소리와 글자가 동시에 출력됨 

}
