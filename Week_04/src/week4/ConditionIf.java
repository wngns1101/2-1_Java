package week4;

import java.util.Scanner;

public class ConditionIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �¾ ������ �Է��ϼ���");
		
		int year = sc.nextInt();
		int age = 2022 - year + 1;
		
		if (20 <= age && age <= 26) {
			System.out.println("���л�");
		}else if(17 <= age && age < 20) {
			System.out.println("����л�");
		}else if(14 <= age && age < 17) {
			System.out.println("���л�");
		}else if(8 <= age && age < 14) {
			System.out.println("�ʵ��л�");
		} else {
			System.out.println("�л��� �ƴմϴ�");
		}
	}
}
