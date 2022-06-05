package week12;

public class Tire {
	public String location;
	public int maxRotation;
	public int accRotation;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accRotation;
		
		if(accRotation < maxRotation) {
			//Ÿ�̾� ������ �����ִ� ���
			System.out.println(location + "��������" + (maxRotation-accRotation) + "ȸ");
			return true;
		} else {
			//Ÿ�̾� ������ �� �ǰ� ��ũ�� ���
			System.out.println("***" + location + "Ÿ�̾���ũ ****");
			return false;
		}
	}
}
