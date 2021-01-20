package ioc.exam.tv;

public class STV2 {
	boolean power = false;
	int volume = 0;
	final int MAX_VOLUME = 10;
	final int MIN_VOLUME = 0;
	
    // 전원을 켜다
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다.");
	}
    // 전원을 끄다.
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다.");
	}
    // 볼륨을 높이다.
	public void volumeUp() {
		if (volume < MAX_VOLUME) {
			volume++;
			System.out.printf("현재 볼륨은 %d입니다.\n", volume);
		}else {
			System.out.println("볼륨이 최대 볼륨입니다.");
		}
	}
    // 볼륨을 낮추다.
	public void volumeDown() {
		if (volume > MIN_VOLUME) {
			volume--;
			System.out.printf("현재 볼륨은 %d입니다.\n", volume);
		}else {
			System.out.println("볼륨이 최소 볼륨입니다.");
		}
	}
}
