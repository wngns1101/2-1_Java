package week5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���:");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanData = new Scanner(System.in);
		String inputStr;
		
		do {
			System.out.print(">");
			inputStr = scanData.nextLine();
			System.out.println(inputStr);
		} while(!inputStr.equals("q"));
		System.out.println();
		System.out.println("���α׷� ����");
		scanData.close();
	}
}
