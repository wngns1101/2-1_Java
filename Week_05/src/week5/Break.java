package week5;

public class Break {
	public static void main(String[] args) {
		while(true) {
		int num = (int) (Math.random() * 10 + 1);
		System.out.println("���� ����: " + num);
		
		if (num == 7) {
			System.out.println("���α׷� ����");
			break;
		}
		}
	}
}
