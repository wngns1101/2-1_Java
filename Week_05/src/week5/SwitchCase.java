package week5;
import java.util.Scanner;

public interface SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ϼ��� �˰� ���� ���� �Է��ϼ���");

		int month = sc.nextInt();
		
		switch (month) {
		case 1:
			System.out.println(month + "���� 31���Դϴ�.");
			break;
		case 2:
			System.out.println(month + "���� 28���Դϴ�.");
			break;
		case 3:
			System.out.println(month + "���� 31���Դϴ�.");
			break;
		case 4:
			System.out.println(month + "���� 30���Դϴ�.");
			break;
		case 5:
			System.out.println(month + "���� 31���Դϴ�.");
			break;
		case 6:
			System.out.println(month + "���� 30���Դϴ�.");
			break;
		case 7:
			System.out.println(month + "���� 31���Դϴ�.");
			break;
		case 8:
			System.out.println(month + "���� 31���Դϴ�.");
			break;
		case 9:
			System.out.println(month + "���� 30���Դϴ�.");
			break;
		case 10:
			System.out.println(month + "���� 31���Դϴ�.");
			break;
		case 11:
			System.out.println(month + "���� 30���Դϴ�.");
			break;
		case 12:
			System.out.println(month + "���� 31���Դϴ�.");
			break;
		}
		sc.close();
	}
}
