package week4;

import java.util.Scanner;

public class ConditionOperator3 {
	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner scanData = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		score = scanData.nextInt();
		grade = (score>90)? 'a':(score>80)? 'b': 'c';
		
		System.out.println("�Է¹��� ����: " + score);
		System.out.println("���� �����: " + grade);
	}
}
