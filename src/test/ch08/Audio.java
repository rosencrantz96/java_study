package test.ch08;

public class Audio implements RemoteControl {
	// 객체지향 == 생산성! 부품 갈아끼우기!

	// 필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: " + this.volume);
	}

	private int memoryVolum; // 볼륨을 기억하는 필드 
	
	// 디폴트 메소드는 오버라이드 시 반드시 public 접근 제한자를 붙여야 한다. 
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolum = this.volume; // 볼륨값이 memoryVolum에 저장됨
			System.out.println("음소거 처리 합니다."); // 저장 후 "음소거 처리" 출력 
			setVolume(RemoteControl.MIN_VOLUME); // 현재 setVolume을 min상수로 변환 
		} else { 
			System.out.println("음소거 해제.");
			setVolume(this.memoryVolum); // 아까 저장해둔 5를 불러옴 
		}
	}

	
}
