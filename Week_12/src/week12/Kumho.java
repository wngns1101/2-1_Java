package week12;

public class Kumho extends Tire {
	public Kumho(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
		System.out.println(location + "��ȣŸ�̾� ���� ����" + (maxRotation-accRotation) + "ȸ");
		return true;
	} else {
		System.out.println("*** " + location + "��ȣŸ�̾� ��ũ ***");
		return false;
	}
}
}
