package homework;

public class Computer implements Control{
	@Override
	public void turnOn() {
		System.out.println("Computer�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Computer�� ���ϴ�.");
		
	}
	public void Volume() {
		System.out.println("���� Computer ����:" + MAX_VOLUME);
	}
}
