package homework;

public class Audio implements Control {
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ���ϴ�.");
		
	}
	public void Volume() {
		System.out.println("���� Audio ����:" + MAX_VOLUME);
	}
}
