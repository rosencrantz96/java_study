package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx1 { // 싱글 쓰레드 

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 빔소리를 냄 
			try {
				Thread.sleep(500); // 0.5초 간 일시정지 
			} catch (Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5초 간 일시정지 
			} catch (Exception e) {}
		}
	}

	
	// 소리가 먼저 나오고 글자가 출력됨 
}
