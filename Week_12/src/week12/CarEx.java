package week12;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=0; i<=10; i++) {
			int flat = car.run();
			if(flat == 1) {
				System.out.println("�ѱ�Ÿ�̾�� ��ü");
				car.frontLeft = new HanKook("�տ���", 15);
			} else if(flat == 2) {
				System.out.println("�ѱ�Ÿ�̾�� ��ü");
				car.frontRight = new HanKook("�տ�����", 15);
			} else if(flat == 3) {
				System.out.println("��ȣŸ�̾�� ��ü");
				car.backLeft = new Kumho("�ڿ���", 15);
			} else if(flat == 4) {
				System.out.println("��ȣŸ�̾�� ��ü");
				car.backRight = new Kumho("�ڿ�����", 15);
			}
			System.out.println("------------");
		}
	}
}
