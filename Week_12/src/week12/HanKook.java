package week12;

public class HanKook extends Tire {
	public HanKook(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
		System.out.println(location + "�ѱ�Ÿ�̾� ���� ����" + (maxRotation-accRotation) + "ȸ");
		return true;
	} else {
		System.out.println("*** " + location + "�ѱ�Ÿ�̾� ��ũ ***");
		return false;
	}
}
}
