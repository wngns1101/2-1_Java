package homework;

public class TV implements Control {

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}
	
	public void Volume() {
		System.out.println("���� TV ����:" + MAX_VOLUME);
	}

}
