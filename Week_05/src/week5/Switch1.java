package week5;

public class Switch1 {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4 + 8);
		
		System.out.println("[����ð�: " + time + "��]");
		
		switch (time) {
		case 8:
			System.out.println("��� ���Դϴ�.");
			break;
		case 9:
			System.out.println("ȸ�� �ð��Դϴ�.");
			break;
		case 10:
			System.out.println("�ٹ� ���Դϴ�.");
			break;
		default:
			System.out.println("���� ���Դϴ�.");
		}
	}
}
