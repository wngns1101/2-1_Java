package week5;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("������ �� ���� ����ұ�");
		Scanner dan = new Scanner(System.in);
		
		int scanData = dan.nextInt();
		System.out.println("������ 5���� ����Ѵ�.");
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", scanData, i, 5*i); 
		}
	}
	
}
