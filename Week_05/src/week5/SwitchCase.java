package week5;
import java.util.Scanner;

public interface SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("일수를 알고 싶은 달을 입력하세요");

		int month = sc.nextInt();
		
		switch (month) {
		case 1:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일입니다.");
			break;
		case 3:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 4:
			System.out.println(month + "월은 30일입니다.");
			break;
		case 5:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 6:
			System.out.println(month + "월은 30일입니다.");
			break;
		case 7:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 8:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 9:
			System.out.println(month + "월은 30일입니다.");
			break;
		case 10:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 11:
			System.out.println(month + "월은 30일입니다.");
			break;
		case 12:
			System.out.println(month + "월은 31일입니다.");
			break;
		}
		sc.close();
	}
}
