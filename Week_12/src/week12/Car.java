package week12;

public class Car {
	//�ʵ�
	Tire frontLeft = new Tire("�տ���", 6);
	Tire frontRight = new Tire("�տ�����", 2);
	Tire backLeft = new Tire("�ڿ���", 3);
	Tire backRight = new Tire("�ڿ�����", 4);
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(!frontLeft.roll()) {
			stop();
			return 1; //1�� Ÿ�̾� ����
		} 
		if(!frontRight.roll()) {
			stop();
			return 2;
		}
		if(!backLeft.roll()) {
			stop();
			return 3;
		}
		if(!backRight.roll()) {
			stop();
			return 4;
		}
		return 0;
		
	}
	void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}
}
